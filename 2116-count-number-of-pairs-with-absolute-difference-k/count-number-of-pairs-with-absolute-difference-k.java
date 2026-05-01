class Solution {
    public int countKDifference(int[] nums, int k) {
        int count  = 0;
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            for(int j=i+1;j<nums.length;j++){
                int b = nums[j];
                int difference = Math.abs(a-b);
                if(difference==k && i<j){
                    count++;
                }
            }
        }
        return count;
        
    }
}