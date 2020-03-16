package todoApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * To-Do-List Class that holds the properties and methods that creates the list
 * instance (the program is using an ArrayList), adds entries, deletes them and
 * displays the list.
 *
 */

public class ToDoList {

	private static ToDoList firstInstance = null;

	private List<String> toDoList = new ArrayList<>();

	private ToDoList() {

	}

	/**
	 * Using the singleton design pattern, the method getInstance is used to create
	 * the only list instance here.
	 * 
	 * @return firstInstance of the list. This is the only instance of the list that
	 *         will be created.
	 */

	public static ToDoList getInstance() {

		if (firstInstance == null) {

			firstInstance = new ToDoList();

		}

		return firstInstance;

	}

	/**
	 * This method is used to add items to the ArrayList.
	 * 
	 * @param item to be added to the ArrayList.
	 */
	public void addListItem(String item) {

		toDoList.add(item);

		System.out.println("\n\nThe item has been added to the list!\n");

	}

	/**
	 * This method is used to remove items from the ArrayList.
	 * 
	 * @param entry to be deleted from the ArrayList.
	 */

	public void removeListItem(int entry) {

		if (entry <= 0 || entry > toDoList.size()) {

			System.out.println("Invalid Entry");

		} else {

			toDoList.remove(entry - 1);

			System.out.println("\n\nThe item has been deleted from the list!\n");

		}

	}

	/**
	 * This method is used to print out the ArrayList items or it will print out a
	 * message if the list is empty.
	 */
	public void printList() {

		int counter = 1;

		if (toDoList.isEmpty()) {

			System.out.println("\nThe to-do list is empty.\n");

		} else {

			System.out.println("");

			for (String item : toDoList) {

				System.out.println(counter + ". " + item);

				counter++;

			}

			System.out.println("");
		}
	}

}
