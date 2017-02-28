package petkopc.enhancedArraylist;

import java.util.ArrayList;

public class EnhancedGroceryList<T> {
	
	// using generic-s
	private ArrayList<T> groceryList;
	
	// Constructor
	public EnhancedGroceryList() {
		groceryList = new ArrayList<>();
	}
	
	// add item to ArrayList
	public void addGroceryItem(T item) {
		groceryList.add(item);
	}
	
	// print grocery list method
	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + " items in your grocery list.");
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println((i+1) + ". " + groceryList.get(i)); // i+1 is for the user
		}
	}
	// Overload method modifyGroceryItem
	public void modifyGroceryItem(T currentItem, T newItem) {
		int position = searchItem(currentItem);
		if (position >= 0 ) {
			modifyGroceryItem(position, newItem);
		} else {
			System.out.println("Invalid item. (NotFound)");
		}
	}
	// modify grocery list
	// force people to use the other method
	private void modifyGroceryItem(int position, T newItem) {
		groceryList.set(position, newItem);
		System.out.println("Grocery item " + (position+1) + " has been modified."); // +1 is for the user
	}
	
	// remove an item from the list using String
	public void removeGroceryItem (T item) {
		int position = searchItem(item);
		if (position >= 0) {
			removeGroceryItem(position);
		}
	}
	// remove an element from a certain position
	private void removeGroceryItem(int position) {
		groceryList.remove(position);
	}
	
	// query the list to find an item
	// finds the first index or -1
	private int searchItem(T item) {
		return groceryList.indexOf(item);  // returns the index where found
	}
	
	// checks if the item is on file
	public boolean onFile(T searchItem) {
		int position = searchItem(searchItem);
		if(position >= 0) {
			return true;
		} else {
			return false;
		}
	}
}
