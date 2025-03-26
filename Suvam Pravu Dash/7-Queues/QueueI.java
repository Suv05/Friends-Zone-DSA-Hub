//Queue reversal

import java.util.*;

public class QueueI {
    public static void reversal(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        //copy all element of queue into stack
        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        //pop from stack and push into queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        //print the queue
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        System.out.println("Original Queue:");
        Queue<Integer> tempQueue = new LinkedList<>(q); // Create a temporary copy for printing
        while (!tempQueue.isEmpty()) {
            System.out.println(tempQueue.peek());
            tempQueue.remove();
        }
        System.out.println("\nReversed Queue:");
        reversal(q); // Call the reversal method on the original queue

    }
}
