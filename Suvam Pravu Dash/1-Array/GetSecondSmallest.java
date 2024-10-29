import java.util.*;

public class GetSecondSmallest {

    //to get first smallest element
    public static int smallest(int[] arr) {

        int smallest = Integer.MAX_VALUE;

        for (int j : arr) {
            if (smallest > j)
                smallest = j;
        }
        return smallest;
    }

    //to get second smallest
    public static int secondSmallest(int[] arr) {
        int fs = smallest(arr);
        int ss = Integer.MAX_VALUE;

        for (int j : arr) {
            if (j != fs && j < ss) {
                ss = j;
            }
        }
        // If ss is still Integer.MAX_VALUE, there was no valid second smallest
        if (ss == Integer.MAX_VALUE) {
            throw new NoSuchElementException("No second smallest element exists");
        }

        return ss;
    }

    public static void main(String[] args) {
        int[] arr = {99, 108, 759, 846, 11, 123, 45, 19, 8, 459, 795, 1885, 9, 7551};
        System.out.println("Second smallest integer is in this array " + secondSmallest(arr));
    }
}
