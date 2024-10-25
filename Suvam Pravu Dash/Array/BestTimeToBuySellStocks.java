public class BestTimeToBuySellStocks {

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


    public static void main(String[] args) {
        int[] price = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(price));
    }
}
