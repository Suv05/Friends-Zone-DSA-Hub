//Interleave 2 Halves of a Queue (even length)
//1 2 3 4 5 6 7 8 9 10
//1 6 2 7 3 8 4 9 5 10

import java.util.*;

public class QueueH {

    public static void interLevel(Queue<Integer> q1) {
        int size = q1.size();
        Queue<Integer> q2 = new LinkedList<>();

        for (int i = 0; i < size / 2; i++) {
            q2.add(q1.remove());
        }

        while (!q2.isEmpty()) {
            //step-1
            q1.add(q2.remove());

            //step-2
            q1.add(q1.remove());

        }

        //print the queue
        while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
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
        System.out.println("\nInterleaved Queue:");
        interLevel(q); // Call the interleaving method on the original queue
    }


}

