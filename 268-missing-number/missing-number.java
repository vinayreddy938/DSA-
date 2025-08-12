class Solution {
    public int missingNumber(int[] nums) {
       int arr[] = new int[nums.length+1];
       for(int i=0;i<nums.length;i++){
         arr[nums[i]]++;
       }
       System.out.print(Arrays.toString(arr));
       for(int j=0;j<arr.length;j++){
        if(arr[j]==0){
              
            return j;
        }

       }
        return nums.length;
        
    }
}