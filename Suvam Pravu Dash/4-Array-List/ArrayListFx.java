import java.util.*;

public class ArrayListFx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //for add
        for (int i = 1; i < 12; i++) {
            list.add(i);
        }

        //for read
//        for (Integer integer : list) {
//            System.out.println(integer + " ");
//        }

        //for delete
//        list.remove(5);
//        System.out.println(list);

        //for update
        list.set(1, 8);
        list.set(2, 14);
        list.set(5, 100);
        System.out.println(list);

        //sorting
        Collections.sort(list);

        //in descending order
        list.sort(Collections.reverseOrder());
        System.out.println(list);
    }
}
