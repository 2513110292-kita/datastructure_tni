
public class QueueTest {

	public static void main(String[] args) {
		QueueArrayBased q = new QueueArrayBased();
		q.enqueue(10);
		q.enqueue(11);
		q.enqueue(12);
		System.out.print(q.peek());
		System.out.print(q.dequeue());

	}

}
