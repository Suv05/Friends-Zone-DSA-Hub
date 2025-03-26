//first non-repeating letter in a stream of characters
//Streams of characters -> you have to solve using queue (trick)

/*Initialization:

Create a frequency array freq of size 26, initialized to all zeros.
Create an empty queue q.

Iterate through the string: For each character in the input string:

Add the current character to the queue q.

Increment the frequency of the current character in the freq array.

While the queue is not empty and the frequency of the character at the front of the queue is greater than 1:
Remove the character from the front of the queue.

If the queue is empty, it means there is no non-repeating character encountered so far. Print -1.

Otherwise, the character at the front of the queue is the first non-repeating character encountered so far. Print this character.*/
import java.util.*;

public class QueueG {
    public static void firstNonRepeatingChar(String str) {
        int[] freq = new int[26]; //'a'-'z'
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.println(-1 + " ");
            } else {
                System.out.println(q.peek() + " ");
            }

        }

    }

    public static void main(String[] args) {
        String str = "aabccxb";
        firstNonRepeatingChar(str);

    }
}
