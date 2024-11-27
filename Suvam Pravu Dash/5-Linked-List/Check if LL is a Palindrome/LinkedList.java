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

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;
    }

    public void print() {
        Node temp = head;

        if (temp == null) {
            System.out.println("Linked List is null");
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(" ");
    }


    //slow-fast approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }

        return slow; //slow is my mid-node
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        //step-1 find mid
        Node midNode = findMid(head);

        //step-2 reverse the 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        //step-3 check 1st half with 2nd half reverse
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;

    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.print();

        System.out.println(ll.checkPalindrome());


    }
}
