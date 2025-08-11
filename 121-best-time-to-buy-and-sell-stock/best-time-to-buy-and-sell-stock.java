class Solution {
    public int maxProfit(int[] arr) {
        int maxProfit = 0;
        int max = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            int diff = max-arr[i];
            if(diff>maxProfit){
                maxProfit = diff;

            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        
        return maxProfit;
    }
}