public class QueueArrayBased {
	
	private int[] queue;
	private final int MAX_SIZE = 50;
	private int size;
	
	public QueueArrayBased() {
		queue = new int[MAX_SIZE];
		size = 0;
	}
	
	public QueueArrayBased(int capacity) {
		queue = new int[capacity];
		size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == queue.length;
	}
	
	public boolean enqueue(int new_element) {
		if (isFull()) {
			return false;
		}
		queue[size] = new_element;
		size++;
		return true;
	}
	
	public int peek() {
		if (isEmpty()) {
			return -1;
		}
		return queue[0];
	}

	public int dequeue() {
		if (isEmpty()) {
			return -1;
		}
		int dequeuedValue = queue[0];
		
		for (int i = 0; i < size - 1; i++) {
			queue[i] = queue[i + 1];
		}
		size--;
		
		return dequeuedValue;
	}
}