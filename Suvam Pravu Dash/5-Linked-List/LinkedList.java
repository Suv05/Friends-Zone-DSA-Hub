public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //methods to do all operations in a linked list

    //addFirst()
    public void addFirst(int data) {
        //step-1 create a new node
        Node newNode = new Node(data);
        size++;

        //if head is null means Linked List is not initialized then
        if (head == null) {
            head = tail = newNode;
            return;
        }

        //step-2 stores head's address in next of newly created node
        newNode.next = head;

        //step-3 make the newly created node as new head
        head = newNode;

    }

    //addLast
    public void addLast(int data) {
        //step-1 create a new node
        Node newNode = new Node(data);
        size++;

        //if head is null means Linked List is not initialized then
        if (head == null) {
            head = tail = newNode;
            return;
        }

        //step-2 now tails next should point the newly created node instead of null
        tail.next = newNode;

        //step-3 tail now move to newly created node
        tail = newNode;

    }

    //add in any position with index
    public void add(int data, int index) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }


    //remove first
    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }

        int val = head.data;
        head = head.next; //now head moves to the second node
        size--;
        return val;


    }

    //remove last
    public int removeLast() {
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // Traverse the list to find the second-to-last node
        Node prev = head;
        while (prev.next != tail) { // Stop one node before the tail
            prev = prev.next;
        }

        int val = tail.data;   // Save the value to return
        tail = prev;           // Update tail to the second-to-last node
        tail.next = null;      // Disconnect the old tail
        size--;
        return val;

    }

    //search in Linked list
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        //if not found return
        return -1;

    }

    //search in a recursive way
    public int helper(int key, Node temp) {
        if (temp == null) {
            return -1;
        }
        if (temp.data == key) {
            return 0;
        }
        int idx = helper(key, temp.next);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(key, head);
    }

    //print the list
    public void print() {
        //assign head address to a temp variable
        Node temp = head;

        if (temp == null) {
            System.out.println("Linked list is null");
        }

        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println(" ");
    }


    //reverse the linked list
    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(100, 2);
        ll.print();
        //System.out.println("Linked List size-> " + size);
        //ll.removeFirst();
        //ll.removeLast();
        //System.out.println("Present index at: " + ll.itrSearch(100));
        //System.out.println("Present index at: " + ll.recSearch(100));

        ll.reverse();
        ll.print();

    }
}
