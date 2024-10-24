public class MaxSubArraySum {

//    public static int maxSubArraySum(int[] arr) {
//        //time complexity n*n*n
//
//        int ts = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                int currSum = 0;
//
//                for (int k = i; k <= j; k++) {
//                    currSum += arr[k];
//                    System.out.print(arr[k]+" ");
//                }
//                if (currSum > ts) {
//                    ts = currSum;
//                }
//                System.out.println(" ->sum: " + currSum);
//            }
//            System.out.println(" ");
//        }
//
//        return ts;
//    }

    public static int smallestNegativeNumberInArray(int[] arr) {
        int smallestNegativeNumber = Integer.MAX_VALUE;

        for (int n : arr) {
            if (n < smallestNegativeNumber) {
                smallestNegativeNumber = n;
            }
        }

        return smallestNegativeNumber;
    }

    public static int maxSubArraySum(int[] arr) {
        //Kedan's algorithm O(N)
        int maxSum = Integer.MIN_VALUE;
        int cs = 0;

        for (int i : arr) {

            cs = cs + i;

            if (cs < 0) cs = 0;

            maxSum = Math.max(cs, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -4, -6, 8, -5, -3};
        // System.out.println("maximum sum of sub array is: " + maxSubArraySum(arr));
        

    }
}
