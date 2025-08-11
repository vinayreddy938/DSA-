class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int oneCount = 0;
        int maxCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                oneCount = 0;
            }else{
                oneCount++;
            }

            if(oneCount>maxCount){
                maxCount  = oneCount;
            }
        }
        return maxCount;
        
    }
}