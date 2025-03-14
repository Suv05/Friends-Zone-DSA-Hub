//Area of the histogram


import java.util.*;

public class StackJ {
    // Find the next smaller element to the right
    public static int[] smallRight(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] nextSmaller = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) { // Traverse from right to left
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextSmaller[i] = arr.length; // No smaller element found
            } else {
                nextSmaller[i] = s.peek(); // Assign the next smaller element
            }
            s.push(i);
        }
        return nextSmaller;
    }

    // Find the next smaller element to the left
    public static int[] smallLeft(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] nextSmaller = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextSmaller[i] = -1;
            } else {
                nextSmaller[i] = s.peek();
            }
            s.push(i);
        }
        return nextSmaller;
    }

    public static void main(String[] args) {
        int[] height = {2, 4};

        int[] nsr = smallRight(height);
        int[] nsl = smallLeft(height);
        int maxArea = 0;
        //current Area: (width = j-i-1 = nsr[i]-nsl[i]-1) * height[i]
        for (int i = 0; i < height.length; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int currentArea = height[i] * width;
            maxArea = Math.max(currentArea, maxArea);

        }
        System.out.println("Maximum Area of Histogram is " + maxArea);
    }
}
