//Implement a stack using two queues (microsoft, google)

import java.util.*;

public class QueueF {
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmptyStack() {
            return q1.isEmpty();
        }

        public void add(int data) {
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            q1.add(data);

            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }

        }

        public void remove() {
            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }

            q1.remove();

        }

        public int peek() {
            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            return q1.peek();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);

        while (!s.isEmptyStack()) {
            System.out.println(s.peek());
            s.remove();
        }

    }
}
