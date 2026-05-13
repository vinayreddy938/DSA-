class Solution {
    public int maxProfit(int[] prices) {
        int maxPrice=0;
        int maxStockPrice= 0;
        for(int i=prices.length-1;i>=0;i--){
            int diff=maxPrice-prices[i];
            if(diff>maxStockPrice){
                maxStockPrice=diff;
            }
            if(prices[i]>maxPrice){
                maxPrice=prices[i];
            }
        }
        return maxStockPrice;
        
    }
}