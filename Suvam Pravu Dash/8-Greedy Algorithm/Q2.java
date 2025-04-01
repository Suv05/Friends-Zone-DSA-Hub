/*Fractional Knapsack
Given the weights and values of N items, put these items in a knapsack of
capacity W to get the maximum total value in the knapsack.

value = [60, 100, 120]
weight = [10, 20, 30]

W = 50

ans = 240*/

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int w = 50;
        int n = value.length;

        // Step 1: Create a ratio array to store {index, value-to-weight ratio}
        double[][] ratio = new double[n][2];


        for (int i = 0; i < n; i++) {
            ratio[i][0] = i; // Store index
            ratio[i][1] = (double) value[i] / weight[i]; // Store value-to-weight ratio
        }

        // Step 2: Sort the ratio array in descending order based on the ratio
        Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));

        // Step 3: Fill the knapsack greedily
        double totalValue = 0;
        int remainingCapacity = w;

        for (int i = 0; i < n; i++) {
            int idx = (int) ratio[i][0]; // Retrieve the original index

            if (remainingCapacity == 0) break;

            if (weight[idx] <= remainingCapacity) {
                //Take full item
                totalValue += value[idx];
                remainingCapacity -= weight[idx];
            } else {
                //take the fraction
                double fraction = (double) (remainingCapacity) / weight[idx];
                totalValue += value[idx] * fraction;
                break; //knapsack is full now

            }
        }
        System.out.println("Maximum value in Knapsack = " + totalValue);
    }
}

/*Step 1: Sort by Value/Weight Ratio
Sorted order:

Item 1 (6.0)

Item 2 (5.0)

Item 3 (4.0)

Step 2: Pick Items Greedily
Knapsack capacity W = 50

Take Item 1 fully (Weight = 10, Value = 60)
Remaining Capacity: 50 - 10 = 40
Total Value: 60

Take Item 2 fully (Weight = 20, Value = 100)
Remaining Capacity: 40 - 20 = 20
Total Value: 60 + 100 = 160

Take 2/3rd of Item 3 (Weight available = 20, Item 3 total weight = 30)
Fraction taken: 20/30=2/3
Value taken: (2/3)×120=80

Remaining Capacity: 0 (Knapsack full)
Total Value: 160 + 80 = 240*/
