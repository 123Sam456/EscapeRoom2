package def;

import java.util.Scanner;

interface IRoomInfo {
	public void Message();
	public void Choices();
	public void ChoiceMessage(int choice);
	public void Outcome(int choice);


// variable names
public String[] hints = {"Hint room 1", "Hint for room 2", "Hint for room 3", "Hint room 4"};
IRoomInfo room1 = new Room1();
IRoomInfo room2 = new Room2();
IRoomInfo room3 = new Room3();
IRoomInfo room4 = new Room4();
IRoomInfo courtYard = new CourtYard();

// room 1 room code
class Room1 implements IRoomInfo{
	// Message to play when the user enters the room
	public void Message() {
		System.out.println("Welcome Message for room 1");
		Choices();
	}
	
	// Lists out options
	public void Choices() {
		System.out.println("1. Try and unlock door");
		System.out.println("2. Option 2");
		System.out.println("3. Option 3");
		System.out.println("4. Hint Book");
		System.out.println("5. Go Back to Court Yard");
		// Gets the number the user picked
		int answer = Main.GetUserInput();
		ChoiceMessage(answer);

	}
	
	// Message plays after the user selects a choice
	public void ChoiceMessage(int choice) {
		if(choice == 1) {
			System.out.println("Congrates here is the key!");
			Outcome(1);
		}
		else if (choice == 2) {
			System.out.println("ChoiceMessage option 2");
		}
		else if (choice == 3) {
			System.out.println("ChoiceMessage option 3");
		}
		else if (choice == 4) {
			System.out.println("here is the hint book!");
			Outcome(4);
		}
		else if (choice == 5) {
			System.out.println("Going back to courtyard");
			courtYard.Message();
		}
	}
	public void Outcome(int choice) {
		
		// open chest
		if (choice == 1) {
			Keys.Room1Key = true;
			Choices();
		}
		// Filler
		else if (choice == 2 || choice == 3) {
			System.out.println("1. Nice");
			int answer = Main.GetUserInput(1);
			if(answer == 1) {
				Choices();
			}
		}
		
		else if (choice == 4) {
		System.out.println(hints[0]);
			System.out.println("1. Nice");
			int answer = Main.GetUserInput(1);
			if(answer == 1) {
				Choices();
			}
		}
	}
}

//room 2 room code
class Room2 implements IRoomInfo{
	// Message to play when the user enters the room
	public void Message() {
		System.out.println("Welcome Message for room 2");
		Choices();
	}
	
	// Lists out options
	public void Choices() {
		System.out.println("1. Try and unlock door");
		System.out.println("2. Option 2");
		System.out.println("3. Option 3");
		System.out.println("4. Hint Book");
		System.out.println("5. Go Back to Court Yard");
		// Gets the number the user picked
		int answer = Main.GetUserInput();
		ChoiceMessage(answer);
	}
	
	// Message plays after the user selects a choice
	public void ChoiceMessage(int choice) {
		if(choice == 1) {
			System.out.println("Congrates here is the key!");
			Outcome(1);
		}
		else if (choice == 2) {
			System.out.println("ChoiceMessage option 2");
		}
		else if (choice == 3) {
			System.out.println("ChoiceMessage option 3");
		}
		else if (choice == 4) {
			System.out.println("here is the hint book!");
			Outcome(4);
		}
		else if (choice == 5) {
			System.out.println("Going back to courtyard");
			courtYard.Message();
		}
	}
	public void Outcome(int choice) {
		
		// open chest
		if (choice == 1) {
			Keys.Room2Key = true;
			Choices();
		}
		// Filler
		else if (choice == 2 || choice == 3) {
			System.out.println("1. Nice");
			int answer = Main.GetUserInput(1);
			if(answer == 1) {
				Choices();
			}
		}
		
		else if (choice == 4) {
		System.out.println(hints[1]);
			System.out.println("1. Thank you for the hint!");
			int answer = Main.GetUserInput(1);
			if(answer == 1) {
				Choices();
			}
		}
	}
}

//room 3 room code
class Room3 implements IRoomInfo{
	// Message to play when the user enters the room
	public void Message() {
		System.out.println("Welcome Message for room 3");
		Choices();
	}
	
	// Lists out options
	public void Choices() {
		System.out.println("1. Try and unlock door");
		System.out.println("2. Tunnel");
		System.out.println("3. Option 3");
		System.out.println("4. Hint Book");
		System.out.println("5. Go Back to Court Yard");
		// Gets the number the user picked
		int answer = Main.GetUserInput();
		ChoiceMessage(answer);
	}
	
	// Message plays after the user selects a choice
	public void ChoiceMessage(int choice) {
		if(choice == 1) {
			System.out.println("Congrates here is the key!");
			Outcome(1);
		}
		else if (choice == 2) {
			System.out.println("Do you wanna go into the tunnel?");
			Outcome(2);
		}
		else if (choice == 3) {
			System.out.println("ChoiceMessage option 3");
		}
		else if (choice == 4) {
			System.out.println("here is the hint book!");
			Outcome(4);
		}
		else if (choice == 5) {
			System.out.println("Going back to courtyard");
			courtYard.Message();
		}
	}
	public void Outcome(int choice) {
		
		// open chest
		if (choice == 1) {
			Keys.Room3Key = true;
			Choices();
		}
		// Filler Dialoge
		else if (choice == 2) {
			System.out.println("1. Yes");
			System.out.println("2. No");
			if(Main.GetUserInput(2) == 1) {
				room4.Message();
			}
			else {
				Choices();
			}
		}
		else if (choice == 3) {
			System.out.println("1. Nice");
			int answer = Main.GetUserInput(1);
			if(answer == 1) {
				Choices();
			}
		}
		
		else if (choice == 4) {
			System.out.println(hints[2]);
			System.out.println("1. Thank you for the hint");
			int answer = Main.GetUserInput(1);
			if(answer == 1) {
				Choices();
			}
		}
	}
}

//room 4 room code
class Room4 implements IRoomInfo{
	// Message to play when the user enters the room
	public void Message() {
		System.out.println("Welcome Message for room 4");
		Choices();
	}
	
	// Lists out options
	public void Choices() {
		System.out.println("1. Try and unlock door");
		System.out.println("2. Option 2");
		System.out.println("3. Option 3");
		System.out.println("4. Hint Book");
		System.out.println("5. Go Back to Court Yard");
		// Gets the number the user picked
		int answer = Main.GetUserInput();
		ChoiceMessage(answer);
	}
	
	// Message plays after the user selects a choice
	public void ChoiceMessage(int choice) {
		if(choice == 1) {
			System.out.println("Congrates here is the key!");
			Outcome(1);
		}
		else if (choice == 2) {
			System.out.println("ChoiceMessage option 2");
		}
		else if (choice == 3) {
			System.out.println("ChoiceMessage option 3");
		}
		else if (choice == 4) {
			System.out.println("here is the hint book!");
			Outcome(4);
		}
		else if (choice == 5) {
			System.out.println("Going back to courtyard");
			courtYard.Message();
		}
	}
	public void Outcome(int choice) {
		
		// open chest
		if (choice == 1) {
			Keys.Room4Key = true;
			Choices();
		}
		// Filler
		else if (choice == 2 || choice == 3) {
			System.out.println("1. Nice");
			int answer = Main.GetUserInput(1);
			if(answer == 1) {
				Choices();
			}
		}
		
		else if (choice == 4) {
		System.out.println(hints[3]);
			System.out.println("1. thank you for the hint");
			int answer = Main.GetUserInput(1);
			if(answer == 1) {
				Choices();
			}
		}
	}
}
	
	public class CourtYard implements IRoomInfo{
		public void Message() {
			System.out.println("This is the welcome message to court yard");
			Choices();
		}
		// shows your options
		public void Choices() {
			System.out.println("1. room 1");
			System.out.println("2. room 2");
			System.out.println("3. room 3");
			System.out.println("4. go outside");
			//int answer = 
			ChoiceMessage(Main.GetUserInput(4));
		}
		// Message after you choice your option
		public void ChoiceMessage(int choice) {
			// found and picked up key
						if(choice == 1) {
							room1.Message();
						}
						// found and didn't pick up key
						else if(choice == 2) {
							room2.Message();
						}
						// tunnel go in yes
						else if(choice == 3) {
							room3.Message();
						}
						// tunnel go in no
						else if(choice == 4) {
							Outcome(4);
						}
		}
		// Message after the outcome
				public void Outcome(int choice) {
					// found and picked up key
					if(choice == 4) {
						if(Keys.Room1Key && Keys.Room2Key && Keys.Room3Key && Keys.Room4Key) {
							// Go outside
							System.out.println("You Win!!!!!!");
						}
						else {
							System.out.println("Dont have all the keys try and find them all");
							Choices();
							// you don't have enough keys
						}
					}
				}
		
		
	}
	}

