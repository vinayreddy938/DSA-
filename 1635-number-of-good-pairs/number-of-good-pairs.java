class Solution {
    public int numIdenticalPairs(int[] nums) {
     int[] freq = new int[101];
     int count = 0;
     for(int i=(nums.length-1);i>=0;i--){
        count+=freq[nums[i]];
        freq[nums[i]]++;
     }

      return count;

    }
}