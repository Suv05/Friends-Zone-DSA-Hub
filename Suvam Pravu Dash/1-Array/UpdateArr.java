public class UpdateArr {
    public static void update(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 14, 17, 19, 99};

        update(arr);

        for (int elementAt : arr) {
            System.out.println(elementAt);
        }
    }
}
