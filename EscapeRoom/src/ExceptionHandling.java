import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int inputChoice = 0; 
		
		boolean validInput = true; 
		
		while(validInput) {
			
			try {
				System.out.println("Please choose a number (1, 2, or 3):");
				
                inputChoice = scanner.nextInt();

                if (inputChoice < 1 || inputChoice > 3) {
                    throw new IllegalArgumentException("Invalid choice! Please choose 1, 2, or 3.");
                }
                
                validInput = false; 
			}
			catch(Exception e) {
				
				System.out.println(e.getMessage());
			}
			
		}
		
		scanner.close();

	}

}
