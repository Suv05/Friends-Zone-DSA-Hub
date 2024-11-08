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

    //find and delete Nth node from end
    public void deleteNthFromEnd(int n) {
        //calculate size first
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        //if we have to delete head
        if (size == n) {
            head = head.next; //remove first
            return;
        }

        int i = 1;
        int nodeToFind = size - n;
        Node prev = head;
        while (i < nodeToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
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

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.deleteNthFromEnd(2);
        ll.print();
    }
}
