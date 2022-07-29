QUESTION LINK - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/

======================================================================================================================================================================
  
  class Solution {
    public int maxProfit(int[] prices) {
        
        int overallProfit = 0;
        int leastSoFar = Integer.MAX_VALUE;
        int price =0; // PROFIT IF SOLD THAT DAY
        
        for(int i=0; i<prices.length; i++){
            
            if(prices[i] < leastSoFar) leastSoFar = prices[i];
            
            price = prices[i] - leastSoFar;
            
            if(price > overallProfit) overallProfit = price;
        }
        return overallProfit;
    }
}
