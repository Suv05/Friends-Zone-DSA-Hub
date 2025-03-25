public class QueueA {
    static class Queue {
        static int[] arr;
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        public void remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) { //Iterate up to 'rear'
                arr[i] = arr[i + 1];
            }
            if (rear >= 0) { // Decrement rear only if the queue is not empty
                rear--;
            }
            System.out.println("deleted item: " + front);
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
