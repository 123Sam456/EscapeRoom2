package def;
import java.util.Scanner;

public class Opening {
    
    // Method to validate username input
    public static void usernameValidation() {
        Scanner scanner = new Scanner(System.in);

        Dialogue dialogue = new Dialogue();
        
        // Variable to hold player name.
        String playerName;
        
        // Loop to validate player name.
        boolean validInput = false; 
        while(!validInput) {
            try {
                //System.out.println("Welcome to our Text-based game.");
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

    }

}

