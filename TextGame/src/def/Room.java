package def;

// Chapter 4.3
interface IRoomInfo {
	public void Message();
	public void Choices();
	public void ChoiceMessage(int choice);
	public void Outcome(int choice);
	public Dialogue dialog = new Dialogue();
	public Ending end = new Ending();

	


// variable names
public String[] hints = {dialog.r1_w1a, dialog.r2_2e1, dialog.r3_2a, dialog.r4_3a};
IRoomInfo room1 = new Room1();
IRoomInfo room2 = new Room2();
IRoomInfo room3 = new Room3();
IRoomInfo room4 = new Room4();
IRoomInfo courtYard = new CourtYard();
 


// room 1 room code
public class Room1 implements IRoomInfo{
	// bools
	public boolean oneSelected = false;
	public boolean fourSelected = false;
	public static boolean hasBook = false;
	
	// Message to play when the user enters the room
	public void Message() {
		System.out.println(dialog.opening);
		System.out.println(dialog.title);
		Choices();
	}
	
	// Lists out options
	public void Choices() {
		System.out.println("1. " + dialog.r1_1);
		System.out.println("2. " + dialog.r1_2);
		System.out.println("3. " + dialog.r1_3);
		if (oneSelected == true) {
			System.out.println("4. " + dialog.r1_4);
		}
		if (fourSelected == true) {
			if (hasBook) {
				System.out.println("5. " + dialog.r1_w1);
			}	
			System.out.println("6. " + dialog.r1_w2);
			System.out.println("7. " + dialog.r1_w3);
			System.out.println("8. " + dialog.r1_w4);
		}
		System.out.println("9. " + dialog.r1_5);
		if (Keys.Room1Key) {
			System.out.println("10. " + dialog.r1_6);
		}
		
		
		// Gets the number the user picked
		int answer = Main.GetUserInput();
		ChoiceMessage(answer);

	}
	
	// Message plays after the user selects a choice
	public void ChoiceMessage(int choice) {
		
		// User unlocks the Key
		if(choice == 1) {
			System.out.println(dialog.r1_1a);
			Outcome(1);
		}
		// User selects dialogue filler choice 2
		else if (choice == 2) {
			System.out.println(dialog.r1_2a);
			System.out.println(dialog.r1_2b);
			Outcome(2);
		}
		// User selects dialogue filler choice 3
		else if (choice == 3) {
			System.out.println(dialog.r1_3a);
			Outcome(3);
		}
		// use hint
		else if (choice == 4) {
			System.out.println(dialog.r1_4a);
			Outcome(4);
		}
		else if (choice == 5) {
			System.out.println(hints[0]);
			Outcome(5);
		}
		else if (choice == 8) {
			System.out.println(dialog.r1_w4a);
			Outcome(8);
		}
		else if (choice == 9) {
			if (Keys.Room1Key) {
				System.out.println(dialog.r1_5a);
			}
			else {
				System.out.println(dialog.r1_5b);
			}
		}
		else if (choice == 10) {
			System.out.println(dialog.r1_6a);
			courtYard.Message();
		}
	}
	// Message after the outcome
	public void Outcome(int choice) {
		
		// player looks around
		if (choice == 1) {
			oneSelected = true;
			Choices();
		}
		// Player picks up the book
		else if (choice == 2) {
			hasBook = true;
		}
		
		// player gets the Reluctant Ending
		else if (choice == 3) {
			System.out.println(dialog.Ending5);
			// this would trigger the EndGame method as well, right?
			Ending.EndGame();
			
		}
		
		// Player checks the wardrobe
		else if (choice == 4) {
			fourSelected = true;
		}
		
		else if (choice == 5) {
			// TO-DO: Apply HintCount from Ending to this
			Ending.usedHintCount++;
		}
		else if (choice == 8) {
			Keys.Room1Key = true;
		}
	}
}

//room 2 room code
public class Room2 implements IRoomInfo{
	boolean secondStage = false;
	
	// Message to play when the user enters the room
	public void Message() {
		System.out.println(dialog.r2_Opening);
		Choices();
	}
	
	// Lists out options
	public void Choices() {
		if(secondStage = false) {
			System.out.println("1. "+ dialog.r2_1);
			System.out.println("2. " + dialog.r2_2);
			System.out.println("3. " + dialog.r2_3);
			System.out.println("4. Go Back to Court Yard");
			// Gets the number the user picked
			int answer = Main.GetUserInput(4);
			ChoiceMessage(answer);
		}
		else {
			System.out.println("1. "+ dialog.r2_2a);
			System.out.println("2. " + dialog.r2_2b);
			System.out.println("3. " + dialog.r2_2c);
			System.out.println("3. " + dialog.r2_2e);
			// Gets the number the user picked
			int answer = Main.GetUserInput(4);
			ChoiceMessage(answer);
		}
		
	}
	
	// Message plays after the user selects a choice
	public void ChoiceMessage(int choice) {
		if (secondStage = false) { 
		// User unlocks the Key
		if(choice == 1) {
			System.out.println(dialog.r2_1a);
			Outcome(1);
		}

		// User select to solve riddle
		else if (choice == 2) {
			//System.out.println(dialog.r2_2a);
			Outcome(2);
		}
		
		// examine shelfs
		else if (choice == 3) {
			System.out.println(dialog.r2_3a);
			Outcome(3);
		}
		else if (choice == 4) {
			//display different messages depending on if the user has key or not
			if(Keys.Room2Key = true) {
				System.out.println(dialog.r2_4a);
			}
			else {
				System.out.println(dialog.r2_4b);	
			}
			courtYard.Message();
		}
		}
		else {
			if(choice == 1) {
				System.out.println(dialog.r2_2a1);
				Choices();
			}
			else if(choice == 2) {
				System.out.println(dialog.r2_2b1);
				Choices();
			}
			else if(choice == 3) {
				System.out.println(dialog.r2_2c1);
				Outcome(4);
			}
			// user hint room 2
			else if (choice == 4) {
				System.out.println(dialog.r2_2e1);
				Ending.usedHintCount++;
				Choices();
			}
		}
	}
	// Message after the outcome
	public void Outcome(int choice) {
		
		// examine desk
		if (choice == 1) {
			Choices();
		}
		// solving riddle
		else if (choice == 2) {
			secondStage = true;
			Choices();
		}
		
		// filler
		else if (choice == 3) {
			Choices();
		}
		// use solves riddle and gets key
		else if (choice == 4) {
		Keys.Room2Key = true;
		secondStage = false;
		Choices();
		}
	}
}

//room 3 room code
public class Room3 implements IRoomInfo{ 
	
	int tracking = 1;
	
	// Message to play when the user enters the room
	public void Message() {
		System.out.println(dialog.r3_Opening);
		System.out.println("1. " + dialog.r3_1);// RUN FORWARD
		Main.GetUserInput(1);
		Choices();
	}
	
	// Lists out options
	public void Choices() {
		System.out.println("1. " + dialog.r3_2);// ASK BOOK
		System.out.println("2. " + dialog.r3_3);// Forward
		System.out.println("3. " + dialog.r3_4);// Right
		System.out.println("4. " + dialog.r3_5);// Left
		System.out.println("5. Go Back to Court Yard");
		// Gets the number the user picked
		int answer = Main.GetUserInput(5);
		ChoiceMessage(answer);
	}
	
	// Message plays after the user selects a choice
	public void ChoiceMessage(int choice) {
		// User selects dialogue choice
		if (choice == 1) {
			System.out.println(dialog.r3_2a);
			Outcome(1);
		}
		// User selects dialogue filler choice 3
		else if (choice == 2) {
			System.out.println(dialog.r3_3a);
			Outcome(2);
		}
		// use hint
		else if (choice == 3) {
			System.out.println(dialog.r3_4a);
			Outcome(3);
		}
		else if (choice == 4) {
			System.out.println(dialog.r3_5a);
			Outcome(4);
		}
		else if (choice == 5) {
			System.out.println("Going back to courtyard");
			courtYard.Message();
		}
	}
	
	// Message after the outcome
	public void Outcome(int choice) {
		// Key is 2, 3, 3, 4
		// User checks for hint for that room
		if (choice == 1) {
			Ending.usedHintCount++;
			Choices();
		}
		
		else if (choice == 2) {
			if (tracking == 1) {
				tracking++;
				Choices();
			}
			else {
				System.out.println(dialog.r3_fail);
			}
		}
		
		else if (choice == 3) {
			if (tracking == 2 || tracking == 3) {
				tracking++;
				Choices();
			}
			else {
				System.out.println(dialog.r3_fail);
			}
		}
		
		else if (choice == 4) {
			if (tracking == 4) {
				System.out.println(dialog.r3_success);
				Keys.Room3Key = true;
				
				// going to room 4 or not
				System.out.println("1. " + dialog.r3_6);
				System.out.println("2. " + dialog.r3_7);
				if(Main.GetUserInput(2) == 2) {
					System.out.println(dialog.r3_7a);
					room4.Message();
				}
				else {
					System.out.println(dialog.r3_6a);
					courtYard.Message();
				}
			}
			else {
				System.out.println(dialog.r3_fail);
			}
			Choices();
		}
	}
}

//room 4 room code
public class Room4 implements IRoomInfo{
	
	
	Boolean secondLayer = false;
	// Message to play when the user enters the room
	public void Message() {
		System.out.println(dialog.r4_opening);
		Choices();
	}
	
	// Lists out options
	public void Choices() {
		if (secondLayer == false) {
			System.out.println("1. " + dialog.r4_1);
			System.out.println("2. " + dialog.r4_2);
			System.out.println("3. " + dialog.r4_8);	// Go back to Room3
			// Gets the number the user picked
			int answer = Main.GetUserInput(3);
			ChoiceMessage(answer);
		}
		else {
			System.out.println("1. " + dialog.r4_3);
			System.out.println("2. " + dialog.r4_4);
			System.out.println("3. " + dialog.r4_5);
			System.out.println("4. " + dialog.r4_6);
			System.out.println("5. " + dialog.r4_7);
			System.out.println("6. " + dialog.r4_8);	// Go back to Room3
			// Gets the number the user picked
			int answer = Main.GetUserInput(6);
			ChoiceMessage(answer);
		}
		
	}
	
	// Message plays after the user selects a choice
	public void ChoiceMessage(int choice) {
		if (secondLayer == false) {
			// User unlocks the Key
			if(choice == 1) {
				System.out.println(dialog.r4_1a);
				Choices();
			}
			// User selects dialogue filler choice 2
			else if (choice == 2) {
				System.out.println(dialog.r4_2a);
				secondLayer = true;
				Choices();
			}
			// user goes back to room 3
			else if (choice == 3) {
				System.out.println(dialog.r3_return);
				Outcome(2);
			}
		}
		
		
		// User asks hint
		if(choice == 1) {
			Ending.usedHintCount++;
			System.out.println(dialog.r4_3a);
			Choices();
		}
		// User selects dialogue filler choice 2
		else if (choice == 2) {
			System.out.println(dialog.r4_4a);
			Choices();
		}
		// User selects dialogue filler choice 3
		else if (choice == 3) {
			System.out.println(dialog.r4_5a);
			Choices();
		}
		// User selects dialogue filler choice 4
		else if (choice == 4) {
			System.out.println(dialog.r4_6a);
			Choices();
		}
		// User unlocks key
		else if (choice == 3) {
			System.out.println(dialog.r4_7a);
			Outcome(1);
		}
		// User goes back to room 3
		else if (choice == 4) {
			System.out.println(dialog.r3_return);
			Outcome(2);
		}
		
	}
	// Message after the outcome
	public void Outcome(int choice) {
		
		// open chest
		if (choice == 1) {
			Keys.Room4Key = true;
			Choices();
		}
		// going back to room 3
		else if (choice == 2) {
			room3.Message();
		}
	}
}
	
public class CourtYard implements IRoomInfo{
	
	// Message to play when the user enters the court yard
	public void Message() {
		System.out.println(dialog.c_Opening);
		Choices();
	}
	// shows your options
	public void Choices() {
		System.out.println("1. " + dialog.c5); // room 1
		System.out.println("2. " + dialog.c4); // room 2
		System.out.println("3. " + dialog.c2); // room 3
		System.out.println("4. You try and open the big door.");
		ChoiceMessage(Main.GetUserInput(4));
	}
	// Message after you choice your option
	public void ChoiceMessage(int choice) {
		// user goes to room 1
		if(choice == 1) {
			room1.Message();
		}
		// user goes to room 2
		else if(choice == 2) {
			room2.Message();
		}
		// User goes to room 3
		else if(choice == 3) {
			room3.Message();
		}
		// User tries to go outside
		else if(choice == 4) {
			Outcome(4);
		}
	}
	// Message after the outcome
	public void Outcome(int choice) {
			// found and picked up key
			if(choice == 4) {
				if(Keys.Room1Key && Keys.Room2Key && Keys.Room3Key && Keys.Room4Key) {
					if(Room1.hasBook == true) {
						if(Ending.usedHintCount == 0) {
							// has but but no hints
							System.out.println(dialog.ending1);
							System.out.println(dialog.ending1a);
						}
						
						if(Ending.usedHintCount >= 1 && Ending.usedHintCount <= 3) {
							// has book and used 1-3 hints
							System.out.println(dialog.ending2);
							System.out.println(dialog.ending2a);
						}

						if(Ending.usedHintCount <= 4) {
							// has book and used 4 hints
							System.out.println(dialog.ending3);
							System.out.println(dialog.ending3a);
						}
					}
					else {
						// doesn't have book
						System.out.println(dialog.ending3);
						System.out.println(dialog.ending3a);
					}

					// this would trigger the EndGame method as well, right?
					Ending.EndGame();
				}
					else {
					System.out.println(dialog.c1);
					Choices();
					// you don't have enough keys
					}
				}
			}
		}
	}

