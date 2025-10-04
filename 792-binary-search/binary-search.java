class Solution {
    public int search(int[] nums, int target) {


        return helper(nums,target,0,nums.length-1);
        
    }
    public static int helper(int[] nums,int target,int left,int right){
        if(left>right){
            return -1;
        }
       int middle = (left+right)/2;
       if(nums[middle]==target){
        return middle;
       }
       else if(nums[middle]<target){
        left = middle+1;
       }
       else if(nums[middle]>target){
        right = middle-1;
       }

       return helper(nums,target,left,right);
    }
}