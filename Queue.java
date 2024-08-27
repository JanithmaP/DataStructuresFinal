import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue);

        // Removing element from the queue
        int removed = queue.remove();
        System.out.println("Removed element: " + removed);
        System.out.println("Queue after removal: " + queue);

        // Peeking the front element
        int front = queue.peek();
        System.out.println("Front element: " + front);
    }
}