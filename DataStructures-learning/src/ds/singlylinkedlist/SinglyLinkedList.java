package ds.singlylinkedlist;

// Only knows about the next node
public class SinglyLinkedList {
	
	private Node first;    // reference to first Node -> null
	
	// the first element points to the next Node
	public SinglyLinkedList() {
		
	}
	
	// check if the list is empty
	// no nodes to the engine
	public boolean isEmpty() {
		return first==null;
	}
	
	// insert at the beginning
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data; // gets the data to be added
		newNode.next = first; // 
	}
}
