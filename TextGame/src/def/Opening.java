package def;
import java.time.LocalTime;
import java.util.Scanner;

public class Opening {
    
    // Method to validate username input
    public static void usernameValidation() {
        Scanner scanner = new Scanner(System.in);

        Dialogue dialogue = new Dialogue();
        
        // Gets the users time
        LocalTime userTime = LocalTime.now();
        
        String timeMessage = "";
        // Gets the hour and minute of the users time in int variables
        int hour = userTime.getHour();
        int min = userTime.getMinute();
        
        // To decide what the message will be
        if((hour <= 5) || (hour == 6 && min == 0)){
        	timeMessage = "Early Morning";
        }
        else if (hour <= 11){
        	timeMessage = "Morning";
        }
        else if (hour <= 12){
        	timeMessage = "Noon";
        }
        else if (hour <= 20){
        	timeMessage = "Afternoon";
        }
        else if (hour <= 23){
        	timeMessage = "Evening";
        }
        
        // Show users time and message
        System.out.println("It is " + userTime);
        System.out.println(timeMessage);
		
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

