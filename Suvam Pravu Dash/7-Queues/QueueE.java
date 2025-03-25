//implement a queue using two stacks (microsoft)
//step-1 create two stack s1 and s2
//step-2 if s1 is empty add the data or remove it and store in s2
//step-1 after adding data in s1 then restore all removed element from s2->s1

import java.util.*;

public class QueueE {
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmptyQueue() {
            return s1.isEmpty();
        }

        public void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public void remove() {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            s1.pop();
        }

        public int peek() {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmptyQueue()) {
            System.out.println(q.peek());
            q.remove();
        }


    }
}
