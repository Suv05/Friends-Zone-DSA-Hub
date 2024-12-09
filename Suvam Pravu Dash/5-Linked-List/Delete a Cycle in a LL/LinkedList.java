public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    //addFirst()
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //print
    public void print() {
        Node temp = head;

        if (temp == null) {
            System.out.println("Linked list is null");
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(" ");
    }

    // Create a cycle at a specific node index(me trying to make it circular 🤣🤣 with gpt)
    public void makeCycleAt(int index) {
        if (head == null || index < 0) {
            return;
        }

        Node temp = head;
        int count = 0;

        // Traverse to the specified node
        while (temp != null && count < index) {
            temp = temp.next;
            count++;
        }

        if (temp != null) {
            tail.next = temp; // Connect the tail to the node at the specified index
        }
    }


    //check isCycle Floyd's algorithm
    public boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void deleteCycle() {
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }

        if (!cycle){
            return;
        }

        //find meeting point
        slow=head;
        Node prev=null; //last node
        while (slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        //remove cycle -> last.next=null
        prev.next=null;

    }


    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.addFirst(8);
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();

        ll.makeCycleAt(4);

        System.out.println(ll.isCycle());
        ll.deleteCycle();
        ll.print();
        System.out.println(ll.isCycle());

    }
}
