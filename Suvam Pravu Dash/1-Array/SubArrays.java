public class SubArrays {

    public static void printSubArray(int[] arr) {
        //time complexity n*n*n
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 10, 12};
        printSubArray(arr);
    }
}
