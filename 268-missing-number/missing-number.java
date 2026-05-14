  class Solution {
      public int missingNumber(int[] nums) {
          int n = nums.length;
          int total_sum = n * (n + 1) / 2;
          int sum_of_array = 0;
  
          for (int num : nums) {
              sum_of_array += num;
          }
  
          return total_sum - sum_of_array;
      }
  }
