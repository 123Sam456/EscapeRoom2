package def;

public class Dialogue {

	// Chapter 1.6
	public final String opening = ("You wake up, and find yourself in a dimly lit room. You're not quite sure where you are. The bed you're sitting in feels oddly comfortable, however. A large book sits beside you. Its cover seems to give off a small glow.");
	public final String title = ("THE ESCAPE ROOM");
	 
	// ROOM 1
	public final String r1_1 = ("Look Around");
	public final String r1_1a = ("The book is next to you on the bed. The only thing of interest in the room is a door and a wardrobe.");
	public final String r1_2 = ("Pick up Book");
	public final String r1_2a = ("You take the book. The book is old, dusty and thick. Its cover is faded, and it is locked shut with a metal lock. A small keyhole is the only way to open the lock. It has a slight glow to it, and seems to radiate warmth.");
	public final String r1_2b = ("The Book has been added to your inventory");
	public final String r1_3 = ("Go back to sleep");
	public final String r1_3a = ("But you just couldn’t handle the pressure. What if there’s something horrible out there? What dangers could abound from such a terrible dungeon? Maybe there’s a reason you were in this room. Maybe you’re waiting for someone to come rescue you. Yes, that’s it. Surely you’re just meant to be in here and wait. Surely you’re meant not to explore the world beyond. Someone will come to help you… Eventually… One day.");
	public final String Ending5 = ("ENDING 5: THE RELUCTANT");
	public final String r1_4 = ("Check the wardrobe"); // if 1 has been selected already.
	public final String r1_4a = ("In the wardrobe is a note: 'I have hidden the key inside this very room. If you want it, you must search.' Then the note fades from view, vanishing entirely. There's a click, and the wardrobe opens. Inside are a set of clothes in disarray. Whoever put these clothes here doesn’t know how to fold.");
	public final String r1_5 = ("Go to the door"); // if 1 has been selected already.
	public final String r1_5a = ("You approach the door. You notice a keyhole at the door. You attempt to open the door, and it won’t budge."); // doesn't have a key
	public final String r1_5b = ("You insert the key into the keyhole. You hear a satisfying click, and the door opens. "); // has a key.
	public final String r1_6 = ("Leave the room"); // if r1_w4a has been selected.
	public final String r1_6a = ("You exit the room...");
	
	// wardrobe
	public final String r1_w1 = ("Ask the book"); // r1_2 and r1_4 selected already
	public final String r1_w1a = ("The book opens by itself to a page somewhere near the beginning. The page reads: “TOP TO BOTTOM”. It closes as quickly as it has been opened. You try to pull on the cover or the hinge. It won’t budge.");
	public final String r1_w2 = ("Look for anything special");
	public final String r1_w2a = ("As far as you can tell, there’s nothing here other than the pile of clothes.");
	public final String r1_w3 = ("Arrange the clothes: Socks, Pants, Shirt.");
	public final String r1_w3a = ("Nothing seems to happen.");
	public final String r1_w4 = ("Arrange the clothes: Shirt, Pants, Socks.");
	public final String r1_w4a = ("You arrange the clothes neatly. You look up, then back down at the pile. On top of the pile lies a key. You take the key.");
	
	
	// COURTYARD
	String c_Opening = ("The door opens to reveal a large, empty courtyard of sorts, except that it is still inside. There are only a few lights hanging around the room, so it is hard to see. A mist hangs in the air, adding a strange and perhaps disconcerting ambience.  2 hallways extend far out to your left and right, and a massive door sits a few hundred yards in front of you.");	
	String c1 = ("You walk for what feels like way longer than it should take to get to the door. When you finally arrive, you see the door is locked by 4 keyholes in 4 separate knobs. Attempting to pull on any of them, you fail to move the door back at all. You do notice however that the keys you’re holding onto seem to give off a glow when near this door. You insert the key into the first knob, and it fits perfectly and stays there. The first knob turns, but the door still fails to budge.");	
	String c2 = ("These lights appear very ancient, and all the wax on them should have melted away. For some reason however, they seem to burn away endlessly without losing any fuel.");
	String c3 = ("The hallway feels longer than it should, but eventually you find yourself standing in front of the door. However, something concerns you… it’s already open.");
	String c4 = ("The hallway this way seems to be less foggy than the rest of the courtyard. Whatever that might mean, you eventually find yourself in front of the door. It seems more ornate than the other doors you’ve seen so far. More importantly, it appears to have no lock of any kind on it.");
	String c5 = ("you go back into the first room...");
	// strings for the other rooms shouldn't be necessary, since they will have opening strings. 
	
	// ROOM 2
	String r2_Opening = ("This room is small, with shelves filled with strange objects. A writing desk sits at the far end, and on top of it is a piece of parchment with elegant handwriting.");
	String r2_1 = ("Examine the desk");
	String r2_1a = ("A drawer in the desk appears to have a very intricate lock, however this lock doesn’t have any keyhole or way to release the lock. On top of the desk, sits a very ancient looking piece of parchment. It has a note that reads:\r\n"
			+ "I am not alive, yet I grow; I don’t have lungs, yet I need air. What am I?");
	String r2_2 = ("Answer the Riddle"); // 1 has been selected
	String r2_2a = ("A plant");
	String r2_2a1 = ("The parchment crinkles slightly, but nothing happens. This must not be the answer.");
	String r2_2b = ("A shadow.");
	String r2_2b1 = ("The room grows colder, as if a chill wind blew through, but the drawer remains locked.");
	String r2_2c = ("A fire.");
	String r2_2c1 = ("The drawer clicks open, and a faint warmth fills the room. You reach inside and find a small, ornate key. The key has a strange warmth to it.");
	String r2_2d = ("A strange silence follows, but the lock does not budge.");
	String r2_2e = ("Ask the book");
	String r2_2e1 = ("The book opens by itself somewhere in the middle, the page simply reading: WARMTH.");
	String r2_3 = ("Examine the shelves");
	String r2_3a = ("As you step further into the room, your eyes drift to the shelves lining the walls. Each shelf is cluttered with strange, seemingly ancient objects, each one more unusual than the last. The top shelves contain liquids of various viscosity. The middle shelves have a number of artifacts, including a small mirror that can fit in the palm of your hand. The bottom shelf is filled with books. One of the books, titled “The nature of Flame and Shadow” seems to glow as you examine it. This glow reminds you of the book that was next to you when you woke up.");
	String r2_4a = ("You leave the room, with yet another key in your collection."); // assuming you have the key
	String r2_4b = ("You leave the room, however you feel as if you’re missing something."); // assuming you don't have the key.
	
	
	// ROOM 3
	String r3_Opening = ("This room is incredibly dark, entirely pitch-black. It’s impossible to see the path ahead of you. A faint glow bounces off the wall, illuminating some symbol, but you can’t make out exactly what it says.");
	String r3_1 = ("Run Forward");
	String r3_1a = ("You try to run headlong into the darkness, hoping to hit a wall, an object, or something that could be at the end. However you never see the end. You turn around and realize that you’re just as close to the room’s entrance as you were when you entered.");
	String r3_2 = ("Ask the book.");
	String r3_2a = ("The book flies out of your hand and illuminates the wall to your left. The symbols now appear as words, reading: FORWARD, RIGHT, RIGHT, LEFT.");
	String r3_3 = ("Move forward slowly.");
	String r3_3a = ("You move a few yards forward.");
	String r3_4 = ("Move to the right slowly.");
	String r3_4a = ("You turn to the right and move a few yards.");
	String r3_5 = ("Move to the left slowly.");
	String r3_5a = ("You turn to the left and move a few yards.");
	String r3_fail = ("You blink, and the light of the entrance just barely illuminates behind you. You’re right back where you started.");
	String r3_success = ("After your careful movements across the pitch-black room, you eventually bump into something. As you do, the symbols on the wall glow bright enough that the room is still slightly dark, but well lit. The thing you bumped into appears to be a pedestal, holding yet another key that you add to your collection. The symbols on the other side of the wall read: Only those who embrace the unknown will find their way. In addition to the key, you see a tunnel well suited for your stature in the corner of the room.");
	String r3_6 = ("Exit the room through the entrance.");
	String r3_6a = ("You leave back through the hall.");
	String r3_7 = ("Enter the tunnel.");
	String r3_7a = ("You enter the tunnel and begin crawling through…");
	String r3_return = ("Exiting out of the tunnel, you find yourself back in the now dimly-lit room. A much better situation from when you entered."); // When the player enters this room from Room 4.
	
	// ROOM 4
	String r4_opening = ("The tunnel exits out into a large room. This room has an ethereal glow, filled with mirrors of various shapes and sizes on every wall. In the center of the room, a beautiful but empty frame sits on a pedestal.");
	String r4_1 = ("Examine the frame.");
	String r4_1a = ("The frame is inscribed with the words: “What you seek can only be seen when you see yourself.”");
	String r4_2 = ("Look at the mirrors.");
	String r4_2a = ("Each mirror shows a slightly different version of yourself, some more distorted than others. One mirror shows you holding something in your hand—a shimmering key.");
	// below options show when 2 is selected
	String r4_3 = ("Ask the book.");
	String r4_3a = ("The book opens to a later page, and shows 2 words: BE YOURSELF.");
	String r4_4 = ("Touch one of the mirrors");
	String r4_4a = ("You try touching one of the mirrors. It’s smooth, almost unnaturally cold to the touch, but nothing happens. For a moment, you wonder if this might have activated some hidden mechanism, but there’s no response.");
	String r4_5 = ("Search behind the mirrors.");
	String r4_5a = ("Thinking the mirrors might be hiding something, you try to pull one off the wall, but it won’t budge. Each mirror is tightly fixed, almost as if it’s part of the room itself. You run your fingers along the edges, feeling for hidden switches or compartments, but find nothing. It seems whatever answer you’re looking for is not behind the mirrors.");
	String r4_6 = ("Knock on the pedestal.");
	String r4_6a = ("You give the pedestal a small knock, listening for any hollow sounds or hidden compartments. But it’s solid all the way through, heavy and unyielding. Whatever answer lies here doesn’t seem to be on the pedestal.");
	String r4_7 = ("Mimic the reflection.");
	String r4_7a = ("You raise your hand slowly, mirroring the position of the figure in the glass. As you do, you feel a slight warmth and weight settle in your palm. When you look down, the key is now in your hand, exactly where it was in the reflection.");
	String r4_8 = ("You exit the room back through the tunnel.");
	
	// ENDINGS
	// ending 1: Has the book, but did not use it at all.
	String ending1 = ("The door opens into a wide open plain. A forest rests a few hundred yards or so to the north. As you take a deep breath and observe the sunny sky for what feels like an eternity, an old man approaches you. “So there was someone inside that accursed place for so long! Oh, and you possess the book! This book carries immense power with it. The power to change fate and reality. And it’s been untouched! You deserve a reward!” He hands you what appears to be a large bag of coins and jewels. “Congratulations my friend, you’ve made an old wizard very happy.” He takes the book, and walks off joyfully. Meanwhile, you’ve earned your freedom and made a small fortune in the process.");
	String ending1a = ("ENDING 1: THE EXCELLENT");
	
	// ending 2: Used 1-3 hints.
	String ending2 = ("The door opens into a wide open plain. A forest rests a few hundred yards or so to the north. As you take a deep breath and observe the sunny sky for what feels like an eternity, an old man approaches you. “So there was someone inside that accursed place for so long! Oh, and you possess the book! This book carries immense power with it. The power to change fate and reality.” With a flourish of his hands, he casts a spell that forces the book to open on its own. The book flies towards him. “Hm… it seems to have some wear and tear. I assume this was your doing?” You nod cautiously. “Very well. I would like you to come with me. You’ve used the book, so you have a glimpse of its power. You should join me in unlocking its full potential.” You follow the old wizard into the woods, wondering what strange situation you’ve found yourself in…");
	String ending2a = ("ENDING 2: THE INITIATE");
	
	// ending 3: used all 4 hints.
	String ending3 = ("The door opens into a wide open plain. A forest rests a few hundred yards or so to the north. As you take a deep breath and observe the sunny sky for what feels like an eternity, an old man approaches you. “So there was someone inside that accursed place for so long! Oh, and you possess the book! This book carries immense power with it. The power to change fate and reality.” With a flourish of his hands, he casts a spell that forces the book to open on its own. The book flies towards him. Slowly as he looks through the book, the slight smile on his face changes to a frown, and eventually to anger. “How dare you. You’ve expended the power of the book! It will take years for it to return to us. You will serve as a conduit of its power.” Before you can protest, the wizard casts another spell that seems to trap you inside an invisible cage that floats near the wizard. He closes the book, and walks off with you into the woods. Only one question remains: What will become of you?");
	String ending3a = ("ENDING 3: THE UNFORTUNATE");
	
	// ending 4: Beat the game without picking up the book. 
	String ending4 = ("The door opens into a wide open plain. A forest rests a few hundred yards or so to the north. You look around, and eventually behind you, but to your surprise, the door is gone. There is no going back into that accursed place. Perhaps you and the book are finally free…");
	String ending4a = ("ENDING 4: FREEDOM");
	
	
}
