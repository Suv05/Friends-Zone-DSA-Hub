public class BinarySearch {

    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {//right
                start = mid + 1;

            } else {//left
                end = mid - 1;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 9, 3, 78, 65, 95, 485, 841, 89458, 8, 84, 4946};
        int key = 9;
        System.out.println(binarySearch(arr, key));
    }
}
