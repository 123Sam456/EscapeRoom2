package def;

import java.util.TreeMap;

public class Keys {
	public static boolean Room1Key;
	public static boolean Room2Key;
	public static boolean Room3Key;
	public static boolean Room4Key;

	// Treemap to store
	public static TreeMap<String, Boolean> hintCount = new TreeMap<>();

	// Set all the hints to false at the beginning of the game.
	static {
		hintCount.put("Hint 1", false);
		hintCount.put("Hint 2", false);
		hintCount.put("Hint 3", false);
		hintCount.put("Hint 4", false);
	}
}