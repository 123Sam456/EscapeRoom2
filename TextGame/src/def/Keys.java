package def;

public class Keys {
	public static boolean Room1Key = false;
	public static boolean Room2Key = false;
	public static boolean Room3Key = false;
	public static boolean Room4Key = false;

	// Treemap
	static TreeMap<String, Boolean> hintCount = new TreeMap<>();

	static {
		hintCount.put("Hint 1", false);
		hintCount.put("Hint 2", false);
		hintCount.put("Hint 3", false);
		hintCount.put("Hint 4", false);
	}
}

public class Ending {
	public static void EndGame() {

		// Convert hints to an array
		Boolean[] hintArray = Keys.hintCount.values().toArray(new Boolean[0]);

		// Initialize the counter
		int usedHintCount = 0;

		// for loop
		for (int i = 0; i < hintArray.length; i++) {
			if (hintArray[i]) {
				usedHintCount++;
			}
		}

		// Outcome
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
