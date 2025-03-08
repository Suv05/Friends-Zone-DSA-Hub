//Stack implementation using array list

import java.util.ArrayList;

public class StackA {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmptyStack() {
            return list.isEmpty();
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            //when stack is empty
            if (list.isEmpty()) {
                System.out.println("No element to show");
                return -1;
            }
            int top = list.getLast();
            list.remove(list.getLast());
            return top;
        }

        public static void peek() {
            //when stack is empty
            if (list.isEmpty()) {
                System.out.println("No element to show");
            }
            int top = list.getLast();
            System.out.println("Top element is: " + top + " now");
        }
    }

    public static void main(String[] args) {
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);

        while (!Stack.isEmptyStack()) {
            Stack.peek();
            System.out.println(Stack.pop());
        }
    }
}
