class Solution {
    public int findClosestNumber(int[] nums) {
        int largest  = Integer.MIN_VALUE;
        int close = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int distance = Math.abs(nums[i]);
            if(distance<close){
                close = distance;
                
            }
            
        }
        for(int i=0;i<nums.length;i++){
               int distance = Math.abs(nums[i]); 
               if(distance==close && largest<nums[i]){
                largest = nums[i];
               }

        }
        return largest;
        
    }
}