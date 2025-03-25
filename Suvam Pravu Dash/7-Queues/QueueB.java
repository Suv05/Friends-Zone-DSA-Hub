//Circular queue implementation using array

public class QueueB {
    static class Queue {
        static int[] arr;
        static int size;
        static int rear;
        static int font;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = font = -1;
        }

        public boolean isEmpty() {
            return rear == -1 && font == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == font;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            if (font == -1) { //for adding the first element
                font = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;

        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[font];

            //last element delete
            if (font == rear) {
                rear = font = -1;
            } else {
                font = (font + 1) % size;
            }

            return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[font];
        }
    }


    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(40);
        System.out.println(q.remove());
        q.add(50);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
