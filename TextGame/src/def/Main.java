package def;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws SQLException {
		// Create two locales
		Locale us = new Locale("en", "US");
		Locale france = new Locale("fr", "FR");
	
		printProperties(us);
		
		// Tokenization Example
		// Create Resource Bundle Object
		ResourceBundle rb = ResourceBundle.getBundle("TextGame", us);
		String format = rb.getString("hello");
		System.out.println(format);

			//create timeGreeting instance to give the time-based message
		TimeGreeting timeGreeting = new TimeGreeting();
			//show the message
		System.out.println(timeGreeting.toString());

		Opening opening = new Opening();
		opening.usernameValidation(); 
		
		// Will display names at the end if user wants to see. 
		//opening.displayPlayerNames(); 

		Main m = new Main();
		m.checkRoom(new IRoomInfo.Room1()); //begin user in room 1
		
	}
	
	public static void printProperties(Locale locale) {
		// Create Resource Bundle Object
		ResourceBundle rb = ResourceBundle.getBundle("TextGame", locale);
		
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("open"));
	}
	
	public void checkRoom(IRoomInfo room) {
		room.Message();
	}
	
	// 5 options on default
	public static int GetUserInput() {
		return GetUserInput(5);
	}
	
	// Chapter 1.5
	// gets user number in the range of 1 to selectedRange 
	public static int GetUserInput(int selectRange){
		Scanner myObj = new Scanner(System.in);
			// Read user input
			int input = -1;
			while (true) {
				String a = myObj.nextLine();
				// Checks if the user inputed a number
				if(isInteger(a)) {
				input = Integer.parseInt(a);
					// checks if the users input is with in the parameters
					// if yes break the while loop and return the user input
					if(input <= selectRange && input >= 1) {
						break;
					}
					else {
						// gets the users next input and checks if it is good
						System.out.println("You didn't input a number in the range you were given");
						continue;
					}
				}
				else {
					// If the user didn't input a number
					System.out.println("You didn't input a number");
					continue;
				}
			}
			// Chapter 6.5
			assert input > 0 : "The user input should be greater than 0";
			return input;
		}
	
	
	public static boolean isInteger(String str) {
	    if (str == null) {
	        return false;
	    }
	    int length = str.length();
	    if (length == 0) {
	        return false;
	    }
	    int i = 0;
	    if (str.charAt(0) == '-') {
	        if (length == 1) {
	            return false;
	        }
	        i = 1;
	    }
	    for (; i < length; i++) {
	        char c = str.charAt(i);
	        if (c < '0' || c > '9') {
	            return false;
	        }
	    }
	    return true;
	}
}

