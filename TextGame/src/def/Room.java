package def;

interface IRoomInfo {
	void Message();
	void Choices();
	void ChoiceMessage(int choice);
	void Outcome(int choice);


// variable names
public String[] hints = {"Hint room 1", "Hint for room 2", "Hint for room 3"};
IRoomInfo room1 = new Room1();
IRoomInfo room2 = new Room2();
IRoomInfo room3 = new Room3();
IRoomInfo room4 = new Room4();
IRoomInfo courtYard = new CourtYard();

public static void main(String args[]) {
	IRoomInfo room = new Room1();
	room.Message();
	room.Choices();
	room.ChoiceMessage(1);
	room.Outcome(1);
}


class Room1 implements IRoomInfo{
	public void Message() {
		System.out.println("Welcome Message for room1");
	}
	public void Choices() {
		System.out.println("1. Try and unlock door");
		System.out.println("2. Option 2");
		System.out.println("3. Option 3");
		System.out.println("4. Hint Book");
		ChoiceMessage(Main.GetUserInput());
	}
	public void ChoiceMessage(int choice) {
		if(Keys.Room1Key) {
			System.out.println("Congradulations! here comes room 2!");
			Outcome(1);
		}
		else {
			System.out.println("3. Check Inventory");
		}
	}
	public void Outcome(int choice) {
		if(choice == 1) {
			room2.Message();
			
		}
		else if (choice == 2) {
			Keys.Room1Key = true;
		}
		else {
		System.out.println("not nice");
		}
	}
}
	

	class Room2 implements IRoomInfo{
		public void Message() {
			System.out.println("This is the welcome message to room 2");
			Choices();
		}
		public void Choices() {
			System.out.println("1. Try and unlock door r2");
			System.out.println("2. Option 2 r2");
			System.out.println("3. Option 3 r2");
			System.out.println("4. Hint Bookc r2");
			ChoiceMessage(Main.GetUserInput());
		}
		public void ChoiceMessage(int choice) {
			if(Keys.Room1Key) {
				System.out.println("Congradulations! here comes room 3!");
				Outcome(1);
			}
			else {
				System.out.println("3. Check Inventory");
			}
		}
		public void Outcome(int choice) {
			if(choice == 1) {
				if(Keys.Room2Key) {
					System.out.println("Congradulations! here comes room 3!");
					Outcome(1);
				}
				else {
					System.out.println("Looks like you need a key better look around");
					Choices();
				}
			}
			else if(choice == 2) {
				System.out.println("option 2 outcome");
			}
			else if(choice == 3) {
				System.out.println("option 3 outcome");
			}
			else if(choice == 4) {
				System.out.println(hints[2]);
			}
		}
	}
	
	class Room3 implements IRoomInfo{
		public void Message() {
			System.out.println("This is the welcome message to room 3");
		}
		// shows your options
		public void Choices() {
			System.out.println("1. Try and unlock door r23");
			System.out.println("2. Option 2 r3");
			System.out.println("3. Option 3 r3");
			System.out.println("4. Hint Bookc r3");
			ChoiceMessage(Main.GetUserInput());
		}
		// Message after you choice your option
		public void ChoiceMessage(int choice) {
			if (choice == 1) {
				System.out.println("Room 3 second option");
				System.out.println("Grab the Key?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				int keyChoice = Main.GetUserInput(2);
				if(keyChoice == 1) {
					Outcome(1);
				}
				else {
					Outcome(2);
				}
			}
			else if (choice == 2){
				System.out.println("Dialog option 2");
			}
		}
		
		// Message after the outcome
		public void Outcome(int choice) {
			// found and picked up key
			if(choice == 1) {
				System.out.println("picked up key");
			}
			// found and didn't pick up key
			else if(choice == 2) {
				System.out.println("didn't pick up key");
			}
			// tunnel go in yes
			else if(choice == 3) {
				System.out.println("you go into the tunnel");
			}
			// tunnel go in no
			else if(choice == 4) {
				System.out.println("you don't go into the tunnel");
			}
			// hint
			else if(choice == 5) {
				System.out.println(hints[2]);
			}
			// go to courtyard
			else if(choice == 6) {
				courtYard.Message();
			}
		}
	}
	
	class Room4 implements IRoomInfo{
		public void Message() {
			System.out.println("This is the welcome message to room 3");
		}
		// shows your options
		public void Choices() {
			System.out.println("1. Try and unlock door r23");
			System.out.println("2. Option 2 r3");
			System.out.println("3. Option 3 r3");
			System.out.println("4. Hint Bookc r3");
			ChoiceMessage(Main.GetUserInput());
		}
		// Message after you choice your option
		public void ChoiceMessage(int choice) {
			if (choice == 1) {
				System.out.println("Room 3 second option");
				System.out.println("Grab the Key?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				int keyChoice = Main.GetUserInput(2);
				if(keyChoice == 1) {
					Outcome(1);
				}
				else {
					Outcome(2);
				}
			}
			else if (choice == 2){
				System.out.println("Dialog option 2");
			}
		}
		
		// Message after the outcome
		public void Outcome(int choice) {
			// found and picked up key
			if(choice == 1) {
				System.out.println("picked up key");
			}
			// found and didn't pick up key
			else if(choice == 2) {
				System.out.println("didn't pick up key");
			}
			// tunnel go in yes
			else if(choice == 3) {
				System.out.println("you go into the tunnel");
			}
			// tunnel go in no
			else if(choice == 4) {
				System.out.println("you don't go into the tunnel");
			}
			// hint
			else if(choice == 5) {
				System.out.println(hints[2]);
			}
			// go to courtyard
			else if(choice == 6) {
				courtYard.Message();
			}
		}
	}
	
	class courtYard implements IRoomInfo{
		public void Message() {
			System.out.println("This is the welcome message to court yard");
		}
		// shows your options
		public void Choices() {
			System.out.println("1. room 1");
			System.out.println("2. room 2");
			System.out.println("3. room 3");
			System.out.println("4. go outside");
			ChoiceMessage(Main.GetUserInput());
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
				}
				else {
					// you don't have enough keys
				}
			}
		}
	}
}
