package def;

public class Ending {
	
	// Initialize the counter to see how many hints have been used.
	public static int usedHintCount = 0;


    // Method to determine ending depending on the hints used.
    public static void EndGame() {

    	// Chapter 3.2
        // Convert treemap to an array to determine if hints have been used or not.
        Boolean[] hintArray = Keys.hintCount.values().toArray(new Boolean[0]);

        

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