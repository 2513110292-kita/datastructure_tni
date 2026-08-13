import java.util.ArrayDeque;
import java.util.Queue;

public class QueueFirstFive {
    public static void main(String[] args) {
        Queue<Integer> n_queue = new ArrayDeque<Integer>();

        for (int i = 101; i <= 110; i++) {
            n_queue.add(i);
        }

        System.out.println("Queue => " + n_queue);

        int size = n_queue.size();
        for (int i = 0; i < size; i++) {
            int current = n_queue.poll();
            if (i < 5) {
                System.out.println(current);
            }
            n_queue.add(current);
        }

        System.out.println("Queue => " + n_queue);
    }
}