class Solution {
    public int maxProfit(int[] prices) {
        int profit=Integer.MIN_VALUE;
        int buy=prices[0];

        for(int num: prices){
            if(num<buy){
                buy=num;
            }else {
                profit= Math.max(profit, num-buy);
            }
        }
        return profit;
        
    }
}