class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int middle = start+((end-start)/2);
            if(middle>0 && nums[middle]==nums[middle-1]){
                int leftCount = middle-1-start;
                if(leftCount%2==1){
                    end=middle-2;
                }else{
                    start = middle+1;
                }
            }
            else if(middle<nums.length-1&&nums[middle]==nums[middle+1]){
                int leftCount = middle-start;
                if(leftCount%2==1){
                    end=middle-1;
                }else{
                    start = middle+2;
                }

            }else{
                return nums[middle];
            }
        }

        return -1;
        
    }
}