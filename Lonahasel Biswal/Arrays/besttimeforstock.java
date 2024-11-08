public class besttimeforstock {
    public static int maxprofit(int []prices){
        int max_profit=0;
        int minprice = Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            minprice=Math.min(minprice,prices[i]);

            int profit=prices[i]-minprice;

            max_profit=Math.max(max_profit, profit);
        }
        return max_profit;
    }
    public static void main(String[] args) {
        
        int prices[]={12,13,15,19,20,17,18};
        System.out.println(maxprofit(prices));
        
    }
    
}
