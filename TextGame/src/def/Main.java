package def;

import java.util.Scanner;

import def.IRoomInfo.CourtYard;;

public class Main {
	public static void main(String[] args) {
		
		CourtYard roomClass = new CourtYard();
		roomClass.Message();
	}
	
	// 5 options on default
	public static int GetUserInput() {
		return GetUserInput(6);
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
