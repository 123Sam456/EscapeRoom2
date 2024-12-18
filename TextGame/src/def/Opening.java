package def;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.apache.derby.jdbc.EmbeddedDataSource;


public class Opening {
    
    // Method to validate username input
    public void usernameValidation() throws SQLException {
    	
        Scanner scanner = new Scanner(System.in); 
        
        // Variable to hold player name.
        String playerName = null;
        
        Dialogue dialogue = new Dialogue(); 
        
        // Loop to validate player name.
        boolean validInput = false; 
        while(!validInput) {
            try {
                
                System.out.println(dialogue.title); 
                System.out.println("Your name: ");
                
                // Get user input and trim any surrounding spaces.
                playerName = scanner.nextLine().trim(); 
                
                // If playerName is empty, display message.
                if(playerName.isEmpty()) {
                    System.out.println("Please enter your name to start the game.");
                }
                // If playerName contains anything other than letters, display message. 
                else if(!playerName.matches("[A-Za-z ]+")) {
                    System.out.println("Name should only contain letters and spaces. Please try again.");
                }
                // If playerName is valid, end loop.
                else {
                    System.out.println("Let's start, " + playerName);
                    validInput = true; 
                }
                
            } catch(Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
        
        System.out.println(dialogue.opening);  
        
        Ending.hashmap.put("Player name", playerName); 
        
        playerNameDatabase(playerName); 
        
    }
    
    // Method to store the player name in the database
    private void playerNameDatabase(String playerName) {
        try (Connection conn = DatabaseConnection()) {
            // Create the player table if it doesn't exist
            createPlayerTable(conn);

            // Insert the player name into the player table
            String insertQuery = "INSERT INTO player (name) VALUES (?)";
            
            try (PreparedStatement ps = conn.prepareStatement(insertQuery)) {
                ps.setString(1, playerName);
                ps.executeUpdate();
                System.out.println("Player name " + playerName + " stored in the database.");
            }
            
        } catch (SQLException e) {
            System.out.println("Error storing player name: " + e.getMessage());
        }
    }

    // Connect database.
    Connection DatabaseConnection() throws SQLException {
    	
        EmbeddedDataSource ds = new EmbeddedDataSource();
        ds.setDatabaseName("TextGameDB" + Math.random());
        ds.setCreateDatabase("create");
        
        return ds.getConnection();
    } 


    // Method to create the player table if it doesn't already exist
    private void createPlayerTable(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        
        // First, try to create the table
        try {
            // Create the player table.
            stmt.executeUpdate("CREATE TABLE player ("
                               + "name VARCHAR(100) NOT NULL)");

            System.out.println("Player table created.");
        } catch (SQLException e) {
            // If the table already exists, display error.
            if (e.getSQLState().equals("X0Y32")) {
                System.out.println("Player table already exists.");
            } else {
                throw e; 
            }
        }
    }

    // Will display it at the end. 
    public void displayPlayerNames() throws SQLException {
    	
        usernameValidation();  
        
        try (Connection conn = DatabaseConnection()) {
            
            Statement stmt = conn.createStatement();

            // Display all player names.
            ResultSet rs = stmt.executeQuery("SELECT id, name FROM player");

            while (rs.next()) {
                System.out.println("Player Name: " + rs.getString("name"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
        }
    }
}

