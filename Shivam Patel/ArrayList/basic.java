package ArrayList;
import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {
        //Wrapper Class
        //Integer i = Integer.valueOf(4);
        //System.out.println(i);
        
        ArrayList<Integer> l1 = new ArrayList<>();
        //Add element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        //get element
        System.out.println(l1.get(0)); //5

        //with loop
        for(int i =0; i<l1.size();i++){
            System.out.print(l1.get(i)+" "); // 5 6 7 8
        }

        //Direct print
        System.out.println("\n"+l1);

        //adding element at some index i
        l1.add(2, 100);
        System.out.println(l1);

        //Modifying element at some index i
        l1.set(2, 50);
        System.out.println(l1);

        //Removing element at index i
        l1.remove(2);
        System.out.println(l1);

        //Only removing element
        l1.remove(Integer.valueOf(5));
        System.out.println(l1.remove(Integer.valueOf(5))); // false bec already removed above
        System.out.println(l1);

        //Checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println(ans);

        //if you don't specify class, you can put anything inside l
        // ArrayList l = new ArrayList();
        // l.add("Shivam");
        // l.add(20);
        // l.add(true);
        // l.add('S');
        // System.out.println(l);

    }
}
