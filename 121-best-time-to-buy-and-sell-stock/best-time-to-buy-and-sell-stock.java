// Say you have an array for which the ith element is the price of a given stock on day i.
//
// If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
//
// Note that you cannot sell a stock before you buy one.
//
// Example 1:
//
//
// Input: [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//              Not 7-1 = 6, as selling price needs to be larger than buying price.
//
//
// Example 2:
//
//
// Input: [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transaction is done, i.e. max profit = 0.
//
//


class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<=1){
            return 0;
        }
        int i1=0;
        int i2=1;
        int maxprofit=0;
        int min=prices[0];
        while(i1<prices.length && i2<prices.length){
            if(prices[i1]<prices[i2]){
                int profit = prices[i2]-prices[i1];
                if(profit>maxprofit){
                    maxprofit=profit;
                }
            i2++;
            }else{
                i1=i2;
                i2++;
            }
        }
        return maxprofit;
    }
}
