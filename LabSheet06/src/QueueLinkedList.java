public class QueueLinkedList {

	private Node front;
	private Node rear;
	
	public QueueLinkedList() {
		front = null;
		rear  = null;
	}
	
	public boolean isEmpty() {
		return front == null;
	}
	
	public void enqueue(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
	}
	
	public int peek() {
		if (isEmpty()) {
			return -1;
		}
		return front.data;
	}
	
	public int dequeue() {
		if (isEmpty()) {
			return -1;
		}
		int value = front.data;
		front = front.next;
		if (front == null) {
			rear = null;
		}
		return value;
	}
	
}