## Trends🔥 of the Week

### Best time to Buy and sell stocks - I

```bash
public static int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            int profit = prices[i] - buyPrice;
            if (profit > maxprofit) {
                maxprofit = profit;
            }

            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
        }

        return maxprofit;

    }

```

### Most Water In a Container

```bash
public static void containerWithMostWater(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;


        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);

            if (area > maxArea) {
                maxArea = area;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Most area is " + maxArea);
    }
```

### Maximum sum of a Sub array

```bash
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
```

### Get 2nd smallest element in an Array

```bash
//to get first smallest element
    public static int smallest(int[] arr) {

        int smallest = Integer.MAX_VALUE;

        for (int j : arr) {
            if (smallest > j)
                smallest = j;
        }
        return smallest;
    }

    //to get second smallest
    public static int secondSmallest(int[] arr) {
        int fs = smallest(arr);
        int ss = Integer.MAX_VALUE;

        for (int j : arr) {
            if (j != fs && j < ss) {
                ss = j;
            }
        }
        // If ss is still Integer.MAX_VALUE, there was no valid second smallest
        if (ss == Integer.MAX_VALUE) {
            throw new NoSuchElementException("No second smallest element exists");
        }

        return ss;
    }
    
```