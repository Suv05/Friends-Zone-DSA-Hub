import java.util.Stack;

//stack using collection framework
public class StackC {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        while (!s.isEmpty()) {
            System.out.println("peeked element" + s.peek());
            System.out.println("pop element" + s.pop());
        }
    }
}
