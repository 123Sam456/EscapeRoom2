package def;

import java.util.Scanner;

import def.IRoomInfo.CourtYard;;

public class Main {
	public static void main(String[] args) {
		
		
		Main m = new Main();
		m.checkRoom(new CourtYard());
		
		//CourtYard roomClass = new CourtYard();
		//roomClass.Message();
	}
	
	public void checkRoom(IRoomInfo room) {
		room.Message();
	}
	
	// 5 options on default
	public static int GetUserInput() {
		return GetUserInput(5);
	}
	
	// gets user number in the range of 1 to selectedRange 
	/*public static int GetUserInput(int selectRange){
		boolean condition = true;
		int input = -1;
		while (condition) {
			try (Scanner myObj = new Scanner(System.in)) {
				if(myObj.hasNextInt()) {
					// Read user input
					input = myObj.nextInt();
					if(input < selectRange && input >= 1) {
						condition = false;	
					}
					else {
						System.out.println("you inputed an invalid number ");
					}
				}
			}
		}
		return input;
	}*/
	
	public static int GetUserInput(int selectRange){
		Scanner myObj = new Scanner(System.in);
			// Read user input
			int input;
			
			while (true) {
			if(myObj.hasNextInt()) {
				input = myObj.nextInt();
			// checks if the users input is with in the parameters
			// if yes break the while loop and return the user input
			if(input <= selectRange && input >= 1) {
				break;
			}
			else {
			// gets the users next input and checks if it is good
				continue;
				//input = myObj.nextInt();//continue;
			}
				}
			else {
				continue;
			}
			}
			return input;
		}
	}

