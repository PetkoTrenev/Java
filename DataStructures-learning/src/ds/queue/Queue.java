package ds.queue;

public class Queue {
	private int maxSize;
	private long[] queueArray;
	// index position for the element in the front
	private int front; // like top in the stack
	private int tail; // index position for the element at the back
	private int nItems; // number of items in queue

	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[size];
		this.front = 0; // first slot of the array
		this.tail = -1; // no item in the array yet to be considered last
		this.nItems = 0;
	}

	// insert things at the back of the queue
	public void insert(long thing) {
		if (tail == maxSize -1) {
			tail = -1; // override if the queue is full (no index out of bound exception)
		}
		tail++; // now is zero so we put the element at position 0
		queueArray[tail] = thing;
		nItems++;
	}

	// remove item from the front of the queue
	public long remove() {
		if (isEmpty()) {
			System.out.println("The queue is empty.");
			return -1;
		} else {
			long temp = queueArray[front]; // get the first thing in line
			front++; // pulled something from front so it should point next
						// thing in line

			if (front == maxSize) {
				front = 0; // we can set back front to the 0th index so we can
							// utilize the queue again
			}
			nItems--;
			return temp;
		}
		
	}

	public boolean isEmpty() {
		return nItems == 0;
	}

	public boolean isFull() {
		return nItems == maxSize;
	}

	// just peaking not changing
	public long peakFront() {
		return queueArray[front];
	}

	// view content of the DS
	public void view() {
		System.out.print("[ ");
		for (int i = 0; i < queueArray.length; i++) {
			System.out.print(queueArray[i] + " ");
		}
		System.out.print(" ]");
	}

}
