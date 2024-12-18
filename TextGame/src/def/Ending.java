import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*; 

package def;

public class Ending {
	
	// Initialize the counter to see how many hints have been used.
	public static int usedHintCount = 0;
	final static String outputFilePath = "F:/TextGameFile.txt"; 
	
	static HashMap<String, String> hashmap = new HashMap<String, String>(); 

	
	private static void SavingFile() {
		try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the file path to save: ");
            String filePath = scanner.nextLine();

            
            // Get the current local time
            LocalTime currentTime = LocalTime.now();

            // Create a formatter to specify the desired string format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

            // Format the local time as a string
            String formattedTime = currentTime.format(formatter);
            Ending.hashmap.put("Time", formattedTime); 
            saveTextToFile(filePath);

            System.out.println("File saved successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
	}
	// for displaying the users name
	 private static void saveTextToFile(String filePath) throws IOException {
	        
	        File file = new File(filePath); 
	        
	        BufferedWriter bf = null; 
	  
	        try { 
	  
	            // create new BufferedWriter for the output file 
	            bf = new BufferedWriter(new FileWriter(file)); 
	  
	            // iterate map entries 
	            for (Map.Entry<String, String> entry : 
	                 hashmap.entrySet()) { 
	  
	                // put key and value separated by a colon 
	                bf.write(entry.getKey() + " : "
	                         + entry.getValue()); 
	  
	                // new line 
	                bf.newLine(); 
	            } 
	  
	            bf.flush(); 
	        } 
	        catch (IOException e) { 
	            e.printStackTrace(); 
	        } 
	        finally { 
	  
	            try { 
	  
	                // always close the writer 
	                bf.close(); 
	            } 
	            catch (Exception e) { 
	            } 
	        } 
	        
	    }
	
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
            System.out.println("You solved with out any hints");
        } else if (usedHintCount >= 1 && usedHintCount <= 3) {
            System.out.println("you used Some hints");
        } else if (usedHintCount == 4) {
            System.out.println("you used all hint");
        } else {
            System.out.println("Do nothing");
        }
        
        
        SavingFile();

        System.out.println("Thank you for playing!");
        
    }
}