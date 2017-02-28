package ds.queue;

public class App {
	public static void main(String[] args) {
		Queue queue = new Queue(5);
		queue.insert(100);
		queue.insert(123);
		queue.insert(12200);
		queue.insert(22);
		queue.insert(33);
		queue.insert(1); // going to be at the beginning of the queue
		queue.view();
		long value = queue.remove();
		System.out.println(value);//queue.remove();
		//queue.remove();
		queue.view();
	}
}
