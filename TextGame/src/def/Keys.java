package def;

public class Keys {
	public static boolean Room1Key = false;
	public static boolean Room2Key = false;
	public static boolean Room3Key = false;
	public static boolean Room4Key = false;

	// Treemap to store
	static TreeMap<String, Boolean> hintCount = new TreeMap<>();

	// Set all the hints to false at the beginning of the game.
	static {
		hintCount.put("Hint 1", false);
		hintCount.put("Hint 2", false);
		hintCount.put("Hint 3", false);
		hintCount.put("Hint 4", false);
	}
}

public class Ending {

	// Method to determine ending depending on the hints used.
	public static void EndGame() {

		// Convert treemap to an array to determine if hints have been used or not.
		Boolean[] hintArray = Keys.hintCount.values().toArray(new Boolean[0]);

		// Initialize the counter to see how many hints have been used.
		int usedHintCount = 0;

		// loop through hintArray to count the hints used.
		for (int i = 0; i < hintArray.length; i++) {
			if (hintArray[i]) {
				usedHintCount++;
			}
		}

		// Display message depending on how many hints used.
		if (usedHintCount == 0) {
			System.out.println("No hint");
		} else if (usedHintCount >= 1 && usedHintCount <= 3) {
			System.out.println("Some hints");
		} else if (usedHintCount == 4) {
			System.out.println("All hint");
		} else {
			System.out.println("Do nothing");
		}
		System.out.println("Thank you for playing!");

	}
}
