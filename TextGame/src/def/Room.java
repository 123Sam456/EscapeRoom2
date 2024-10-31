package def;

interface IRoomInfo {
	String Message();
	void Choices();
	void ChoiceMessage(int choice);
	void Outcome(int choice);
	
}

class Room1 implements IRoomInfo{

	public String Message() {
		return "Welcome To the Bedroom you just woke up blah blah blah";
	}
	public void Choices() {
		System.out.println("1. Try and unlock door");
		System.out.println("2. Check Drawer");
		System.out.println("3. Check Inventory");
	}
	public void ChoiceMessage(int choice) {
		if(choice == 1 && key.Blue) {
			
		}
		else if() {
			
		}
	}
	public void Outcome(int choice) {
		return "";
	}
	
	public static void main(String args[]) {
		IRoomInfo room = new Room1();
		room.Message();
		room.Choices();
		room.ChoiceMessage(1);
		room.Outcome(1);
	}
}
