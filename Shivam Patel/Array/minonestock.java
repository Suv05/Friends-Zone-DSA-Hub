package Array;

class minonestock {
    public int maximumProfit(int prices[]) {
        
        int n = prices.length, buy =prices[0], profit=0;
        
        for(int i =1;i<n;i++){
            
            if(prices[i]<=buy){
                buy=prices[i];
            }
            else{
                profit=Math.max(profit,prices[i]-buy);
            }
            
        }
        return profit;
    }

    public static void main(String[] args) {
        minonestock sc = new minonestock();
        int prices[] = {7,10,1,3,6,9,2};

        System.out.println("Max Profit is : "+sc.maximumProfit(prices));
    }
}
