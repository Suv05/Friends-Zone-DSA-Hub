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


    public static int maxSubArraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int j : arr) {
            currentSum += j;

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -4, -6, -3, -5, -3};
        System.out.println("maximum sum of sub array is: " + maxSubArraySum(arr));


    }
}
