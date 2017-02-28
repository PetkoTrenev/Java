package ds.linkedlist;

public class App {
	public static void main(String[] args) {
		Node nodeA = new Node();
		nodeA.data = 4;
		
		Node nodeB = new Node();
		nodeB.data = 5;
		
		Node nodeC = new Node();
		nodeC.data = 7;
		
		Node nodeD  = new Node(); 
		nodeD.data = 9;
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		
		
	}
	
	public void countLength(Node aNode) {
		
		int length = 0;
		
		Node currentNode = aNode;
		
		if (currentNode != null) {
			length++;
			currentNode = currentNode.next;
		}
	}
}
