
import java.util.Scanner;

public class Opening {
	
	// Can call this method where needed. 
	public static void usernameValidation() {
	
		Scanner scanner = new Scanner(System.in); 
		
		// Variable to hold player name. 
		String playerName; 
		
		// Loop to validate player name. 
		boolean validInput = false; 
		while(!validInput) {
			
			System.out.println("Welcome to our Text-based game.");
			
			System.out.println("Explain how to play "); 
			
			System.out.println("Your name: "); 
			
			// Trim the name and store. 
			playerName = scanner.nextLine().trim(); 
			
			// If - playerName object is empty, display message. 
			// else if - if user input is not letters, display message.
			if(playerName == null) {
				
				System.out.println("Please enter your name to start the game: ");
			}
			else if(!playerName.matches("[A-Za-z]+")) {
				
				System.out.println("Name should only contain letters: ");
			}
			else {
				System.out.println("Let's start, " + playerName);
				// End loop.
				validInput = true; 
			}
			
			// Close the scanner. 
			scanner.close();
			
		}
		
	
	}
	
	// Example
	public static void main(String[] args) {
		
		usernameValidation(); 
	}
	

}
