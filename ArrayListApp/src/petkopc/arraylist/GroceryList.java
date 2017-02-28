package petkopc.arraylist;

import java.util.ArrayList;

// Two ways of implementing ArrayList with generics and with raw type
public class GroceryList<T> {
	// using Generics -> So I can put anything into it
	private ArrayList<T> groceryList;
	// using raw type
	private ArrayList<String> groceryList2;
	
	// Constructor
	public GroceryList() {
		groceryList = new ArrayList<>();
		groceryList2 = new ArrayList<>();
	}
	
	// add item to ArrayList both ways
	@SuppressWarnings("unchecked")
	public void addGroceryItem(String item) {
		groceryList.add((T) item);
		groceryList2.add(item);
	}
	
	// print grocery list method
	public void printGroceryLists() {
		System.out.println("You have " + groceryList.size() + " items in your grocery list.");
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println((i+1) + ". " + groceryList.get(i));
		}
		System.out.println("You have " + groceryList2.size() + " items in your second grocery list.");
		for (int i = 0; i < groceryList2.size(); i++) {
			System.out.println((i+1) + ". " + groceryList2.get(i));
		}
	}
	
	// modify grocery list
	public void modifyGroceryItem(int position, String newItem) {
		groceryList.set(position, (T) newItem);
		groceryList2.set(position, newItem);
		System.out.println("Grocery item " + (position+1) + " has been modified."); // +1 is for the user
	}
	
	// remove an element from a certain position
	public void removeGroceryItem(int position) {
		T theItem = groceryList.get(position);
		groceryList.remove(position);
		String theItem2 = groceryList2.get(position);
		groceryList2.remove(position);
	}
	
	// query the list to find an item
	public T findItem(String searchItem) {
		// build in ArrayList method
		//	boolean exists = groceryList.contains(searchItem); // return true if the String object is present using .equals
		//	boolean exist2 = groceryList2.contains(searchItem); // same for the raw type
		int position = groceryList.indexOf(searchItem); // -1 if not present
		if (position >= 0) {
			return groceryList.get(position);
		}
		
		return null;
	}
}
