package Array;
import java.util.Arrays;

class Reversearr {
    public static void main(String[] args) {
        int[] arr = {5,4,8,2,1};
        int i = 0;
        int j = arr.length - 1;
        int  temp = 0;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
