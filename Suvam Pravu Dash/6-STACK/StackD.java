import java.util.*;

//push the element at the bottom of the stack
public class StackD {
    public static void pushAtTheBottom(Stack<Integer> s, int data) {
        //base case when stack is empty at one stage
        if (s.isEmpty()) {
            s.push(data);
            return;

        }
        int top = s.pop(); //first remove items from stack
        pushAtTheBottom(s, data); //recursion call
        s.push(top); //push the deleted item again when data is already at bottom

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushAtTheBottom(s, 5);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
