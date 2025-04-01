/*Indian Coins

We are given an infinite supply of denominations [1, 2, 5, 10, 20, 50, 100, 500, 2000].
Find min no. of coins/notes to make change for a value V.

V = 121
ans = 3 (100 + 20 + 1)

V = 590
ans = 4 (500 + 50 + 20 + 20)*/

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Integer[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        int amount = 590;

        //step-1 array to be sorted in descending order
        Arrays.sort(coins, Comparator.reverseOrder());

        //step-2 Array list to store the coins used
        ArrayList<Integer> ans = new ArrayList<>();
        int maxUsedCoins = 0;

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    ans.add(coins[i]);
                    maxUsedCoins++;
                    amount = amount - coins[i];
                }
            }
        }
        System.out.println("Max used coins: " + maxUsedCoins);

        for (int i : ans) {
            System.out.print("(" + i + ")");
        }

    }
}
