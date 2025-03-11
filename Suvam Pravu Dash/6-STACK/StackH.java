//Next greater element

import java.util.*;

public class StackH {

    public static int[] nextGreaterIs(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] nextGreater = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.empty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }

        return nextGreater;
    }

    public static void main(String[] args) {
        int[] arr = {9, 6, 8, 0, 2, 3};
        int[] nextGreater = nextGreaterIs(arr);

        for (int i : nextGreater) {
            System.out.println(i);
        }

    }
}
