import java.util.*;

public class PairSum2 {
    public static boolean isPairSum(ArrayList<Integer> list, int target) {

        int bp = -1; //breaking point
        int n = list.size();
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
            }
        }

        int start = bp + 1; //means smallest value
        int end = bp; //largest value

        while (start != end) {
            if (list.get(start) + list.get(end) == target) {
                return true;
            }

            if (list.get(start) + list.get(end) < target) {
                start = (start + 1) % n;
            } else {
                end = (n + end - 1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
//for sorted and rotated array list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        if (isPairSum(list, 100)) {
            System.out.println("It is pair sum exits");
        }else {
            System.out.println("Not exists");
        }
    }
}
