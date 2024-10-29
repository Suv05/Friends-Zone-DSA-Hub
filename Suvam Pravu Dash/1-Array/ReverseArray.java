public class ReverseArray {

    public static int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap the elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move the pointers
            start++;
            end--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 6, 7, 6, 54};
        reverse(arr);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
