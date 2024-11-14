package def;

import java.util.Scanner;

import def.IRoomInfo.CourtYard;;

public class Main {
	public static void main(String[] args) {
		
		
		//Main m = new Main();
		//m.checkRoom(new CourtYard());

		Opening opening = new Opening();
		opening.usernameValidation();
		
		
		Main m = new Main();
		m.checkRoom(new CourtYard());
		
	}
	
	public void checkRoom(IRoomInfo room) {
		room.Message();
	}
	
	// 5 options on default
	public static int GetUserInput() {
		return GetUserInput(5);
	}
	
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

