import java.util.*;

public class ArrayListType {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        //sub list
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        //add elements to sub-list
        list1.add(4);
        list1.add(5);
        list2.add(10);
        list2.add(20);

        //add sub-list to main list
        mainList.add(list1);
        mainList.add(list2);

        System.out.println(mainList);

    }
}
