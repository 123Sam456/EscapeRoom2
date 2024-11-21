package def;

public class Dialogue {

	public String opening = ("You wake up, and find yourself in a dimly lit room. You're not quite sure where you are. The bed you're sitting in feels oddly comfortable, however. A large book sits beside you. Its cover seems to give off a small glow.");
	public String title = ("THE ESCAPE ROOM");
	 
	// ROOM 1
	public String r1_1 = ("Look Around");
	public String r1_1a = ("The book is next to you on the bed. The only thing of interest in the room is a door and a wardrobe.");
	public String r1_2 = ("Pick up Book");
	public String r1_2a = ("You take the book. The book is old, dusty and thick. Its cover is faded, and it is locked shut with a metal lock. A small keyhole is the only way to open the lock. It has a slight glow to it, and seems to radiate warmth.");
	public String r1_2b = ("The Book has been added to your inventory");
	public String r1_3 = ("Go back to sleep");
	public String r1_3a = ("But you just couldn’t handle the pressure. What if there’s something horrible out there? What dangers could abound from such a terrible dungeon? Maybe there’s a reason you were in this room. Maybe you’re waiting for someone to come rescue you. Yes, that’s it. Surely you’re just meant to be in here and wait. Surely you’re meant not to explore the world beyond. Someone will come to help you… Eventually… One day.");
	public String Ending5 = ("ENDING 5: THE RELUCTANT");
	public String r1_4 = ("Check the wardrobe"); // if 1 has been selected already.
	public String r1_4a = ("In the wardrobe is a note: 'I have hidden the key inside this very room. If you want it, you must search.' Then the note fades from view, vanishing entirely. There's a click, and the wardrobe opens. Inside are a set of clothes in disarray. Whoever put these clothes here doesn’t know how to fold.");
	public String r1_5 = ("Go to the door"); // if 1 has been selected already.
	public String r1_5a = ("You approach the door. You notice a keyhole at the door. You attempt to open the door, and it won’t budge."); // doesn't have a key
	public String r1_5b = ("You insert the key into the keyhole. You hear a satisfying click, and the door opens. "); // has a key.
	public String r1_6 = ("Leave the room"); // if r1_w4a has been selected.
	public String r1_6a = ("You exit the room...");
	
	// wardrobe
	public String r1_w1 = ("Ask the book"); // r1_2 and r1_4 selected already
	public String r1_w1a = ("The book opens by itself to a page somewhere near the beginning. The page reads: “TOP TO BOTTOM”. It closes as quickly as it has been opened. You try to pull on the cover or the hinge. It won’t budge.");
	public String r1_w2 = ("Look for anything special");
	public String r1_w2a = ("As far as you can tell, there’s nothing here other than the pile of clothes.");
	public String r1_w3 = ("Arrange the clothes: Socks, Pants, Shirt.");
	public String r1_w3a = ("Nothing seems to happen.");
	public String r1_w4 = ("Arrange the clothes: Shirt, Pants, Socks.");
	public String r1_w4a = ("You arrange the clothes neatly. You look up, then back down at the pile. On top of the pile lies a key. You take the key.");
	
	
			
}
