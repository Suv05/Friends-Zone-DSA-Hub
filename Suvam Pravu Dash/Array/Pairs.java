public class Pairs {

    public static void pairs(int[] arr) {
        //time complexity = n*n

        int totalNoOfPairs = (arr.length * (arr.length + 1)) / 2;
        for (int i = 0; i < arr.length; i++) {

            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("( " + curr + " , " + j + ")");
            }
        }

        System.out.println("Total no of pairs= " + totalNoOfPairs);

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 8, 9, 7, 6, 4, 3};
        pairs(a);

    }
}
