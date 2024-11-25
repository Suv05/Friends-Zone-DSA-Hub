public class LinearSearch {

    public static int linearSearch(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] arr = {"apple", "ball", "cat", "dog"};
        String key = "apple";
        int index = linearSearch(arr, key);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index " + index);
        }
    }
}
