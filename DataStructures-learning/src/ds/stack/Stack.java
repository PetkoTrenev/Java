package ds.stack;

// Basic implementation of the idea of a stack
// 
public class Stack {

	private int maxSize;
	private long[] stackArray;
	private int top;

	public Stack(int size) {
		maxSize = size;
		this.stackArray = new long[maxSize];
		// represent index position of the last item placed on stack
		this.top = -1;
	}

	// pushes an element on top of the stack
	public void push(long j) {
		if (isFull()) {
			System.out.println("The stack is already full.");
		} else {
			// put on top
			top++;
			stackArray[top] = j;
		}
	}

	// removes the element at the top of the stack
	public long pop() {
		if (isEmpty()) {
			System.out.println("The stack is empty.");
			return -1;
		} else {
			// make copy of current top
			int old_top = top;
			// removed from top of the stack
			top--;
			return stackArray[old_top];
		}
	}

	// peaks at the top of the stack
	public long peak() {
		return stackArray[top];
	}

	// checks if the stack is empty
	public boolean isEmpty() {
		return (top == -1);
	}

	// checks if the stack is full
	public boolean isFull() {
		// why -1 the top of the array is length of array in this case maxSize -
		// 1
		return (maxSize - 1 == top);
	}

}
