import java.util.*;

public class PairSum1 {

    //applicable only in case of sorted array list
    public static void pairSum(ArrayList<Integer> list, int targetSum) {
        int start = 0;
        int end = list.size() - 1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(start) + list.get(end) == targetSum) {
                System.out.println("Pairs are :" + "[" + list.get(start) + "," + list.get(end) + "]");
                return;
            } else if (list.get(start) + list.get(end) < targetSum) {
                start++;
            } else if (list.get(start) + list.get(end) > targetSum) {
                end--;
            }else {
                System.out.println("no pairs found");
            }
        }
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
