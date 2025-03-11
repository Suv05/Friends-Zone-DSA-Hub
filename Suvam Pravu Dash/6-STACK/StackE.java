//reverse a string using stack

import java.util.*;

public class StackE {
    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        //store all charters in stack
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder newStr = new StringBuilder();
        while (!s.isEmpty()) {
            Character c = s.pop(); //store remove chars
            newStr.append(c); // append them here
        }

        return newStr.toString(); //covert StringBuilder to string
    }

    public static void main(String[] args) {

        String str = "suresh";
        System.out.println("Current string \"" + str + "\"");
        System.out.println("after reverse \"" + reverse(str) + "\"");


    }
}
