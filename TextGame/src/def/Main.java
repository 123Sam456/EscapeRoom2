package def;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	private static final Logger Log = LogManager.getLogger(Main.class.getName());

	public static void main(String[] args) {
		int i = 2;
		i = GetUserInput();
		
		System.out.println(i);


	}
	
	// 5 options on default
	public static int GetUserInput() {
		return GetUserInput(5);
	}
	
	// gets user number in the range of 1 to selectedRange 
	public static int GetUserInput(int selectRange){
		boolean condition = true;
		int input = -1;
		while (condition) {
		try (Scanner myObj = new Scanner(System.in)) {
			String UserInput = myObj.nextLine();  // Read user input
			try {
				input = Integer.parseInt(UserInput);
				if(input < selectRange && input >= 1) {
					System.out.println("correct input");
					condition = false;	
				}
				else {
					System.out.println("you inputed an invalid number ");
				}
				} catch (NumberFormatException e) {
			    	System.out.println("Invalid number format: " + e.getMessage());
				}
			}
		}
		return input;
	}
	

}
