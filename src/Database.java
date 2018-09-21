import java.util.Scanner;

/**
 * The driver for the Linked List Project. Performs menu operations and calls 
 * operations from the table.
 * 
 * 
 * @author Tyler M. and P.
 *
 */
public class Database {
	//TODO write Database class
	
	public static void main(String... args) {
		System.out.println("Welcome to Database Deluxe 4999");
		
		int choice = -1;
		
		while (choice != 0) {

			System.out.println("\n\nPlease make a choice:");
			System.out.println("\t\t0) Quit\n\t\t1) Intersect\n\t\t2)" +
							   "Difference\n\t\t3) Union\n\t\t4) Select\n" + 
							   "\t\t5)Remove\n\t\t6)Print both tables");
			System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
			Scanner inputChoice = new Scanner(System.in);
			
			choice = inputChoice.nextInt();
			
			switch (choice) {
			
				case 1: 
						break;
				
				case 2:
						break;
				
				case 3: 
						break;
				
				case 4: 
						break;
				
				case 5: 
						break;
				
				case 6: 
						break;
				
				case 0: System.out.println("Goodbye!");
						break;
				
				default:
						System.out.println("\nPlease enter a number 0-6");
						break;
			
			}
			
		}//end while loop
		
	}
	
}