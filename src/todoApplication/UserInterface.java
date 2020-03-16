package todoApplication;

import java.util.Scanner;

/**
 * 
 * This is a simple to-do-item application. It creates a list and lets the user
 * view, add and delete the entries of the list. This application was created
 * using both the Singleton and Facade Design Patterns.
 *
 */

public class UserInterface {

	/**
	 * Console interface the user will use to interact with the list.
	 * 
	 * @param args an array of command-line arguments for the application
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int selection;
		String addEntry;
		int deleteEntry;
		System.out.println("This is a to-do-item application.");
		ToDoList list = ToDoList.getInstance();
		boolean loop = true;
		while (loop) {
			System.out.println("\nSelect an action:");
			System.out.println("Input the number 1 to view the to-do-item list.");
			System.out.println("Input the number 2 to to add an item to the list.");
			System.out.println("Input the number 3 to delete an item to the list.");
			System.out.println("Input the number 4 to end the program");
			System.out.print("\nEnter the number of your selection: ");
			selection = in.nextInt();
			in.nextLine();
			System.out.println("");
			switch (selection) {
			case 1:
				list.printList();
				break;
			case 2:
				System.out.print("\nEnter to-do list entry: ");
				addEntry = in.nextLine();
				list.addListItem(addEntry);
				break;
			case 3:
				list.printList();
				System.out.print("\nEnter the number of the item you wish to delete: ");
				deleteEntry = in.nextInt();
				in.nextLine();
				list.removeListItem(deleteEntry);
				break;
			case 4:
				loop = false;
				break;
			default:
				System.out.println("Invalid entry, select a number from the list");
			}

		}

		in.close();
		System.out.println("Program ended.");

	}

}
