class Solution {
    public int majorityElement(int[] nums) {
        int currentLeader = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                currentLeader = nums[i];
                count++;

            }else if(currentLeader==nums[i]){
                count++;
            }else{
                count--;
            }
        }
    
        return currentLeader;
    }
}