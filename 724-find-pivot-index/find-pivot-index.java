class Solution {
    public int pivotIndex(int[] nums) {
        int totalRightSum =0;
        for(int i=0;i<nums.length;i++){
            totalRightSum+=nums[i];
        }
    
        int leftSum =0;
        for(int i=0;i<nums.length;i++){
              totalRightSum-=nums[i];
            if(leftSum==totalRightSum){
                return i;
            }
             
            leftSum+=nums[i];
    
        }
        return -1;
        
    }
}