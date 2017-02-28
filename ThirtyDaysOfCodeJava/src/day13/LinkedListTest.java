
package day13;

import java.util.Scanner;

public class LinkedListTest {
	
	public static Node insert (Node head, int data) {
		Node myNode = new Node(data);
		
		if(head == null){
	        head = new Node(data);
	        return head;
	    } else {
	    	Node temp = head;
	    	while(temp.next != null) {
	    		temp = temp.next;  
	    	}
	    	temp.next = new Node(data);
	    	
	    	return head;
	    }
		
		
	}
	
	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
            N--;
        }
        display(head);
        sc.close();
    }
}


