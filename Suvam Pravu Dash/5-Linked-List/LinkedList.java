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

    //methods to do all operations in a linked list

    //addFirst()
    public void addFirst(int data) {
        //step-1 create a new node
        Node newNode = new Node(data);

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

    //print the list
    public void print() {
        //assign head address to a temp variable
        Node temp = head;

        if (temp == null) {
            System.out.println("Linked list is null");
        }

        while (temp != null) {
            System.out.print(temp.data + " " + "->");
            temp = temp.next;
        }
        System.out.println(" ");
    }


    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();


    }
}
