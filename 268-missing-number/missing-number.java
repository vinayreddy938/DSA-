class Solution {
    public int missingNumber(int[] nums) {
       int n = nums.length;
       int sum = 0;
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
       }
       System.out.println(sum);
       System.out.println(n*((n+1)/2));
       return (n * (n + 1)) / 2-sum;
        
    }
}