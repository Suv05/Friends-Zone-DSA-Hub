import java.util.*;

public class PairSum1 {

    //applicable only in case of sorted array list
    public static void pairSum(ArrayList<Integer> list, int targetSum) {
        int start = 0;
        int end = list.size() - 1;
        
        // Loop until start is less than end
        while (start < end) {
            int sum = list.get(start) + list.get(end);
            if (sum == targetSum) {
                System.out.println("Pairs are : [" + list.get(start) + ", " + list.get(end) + "]");
                return;
            } else if (sum < targetSum) {
                start++;
            } else {
                end--;
            }
        }
        
        // If no pair is found, print a message
        System.out.println("No pairs found");
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 9; i++) {
            list.add(i);
        }

        int targetSum = 19;
        pairSum(list, targetSum);
    }
}
