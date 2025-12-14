class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            stack.push(nums[i]);
        }
        for(int i=nums.length-1;i>=0;i--){
            if(stack.peek()>nums[i]){
                ans[i] = stack.peek();
                stack.push(nums[i]);
            }else{
                while(!stack.isEmpty()){
                    if(stack.peek()<=nums[i]){
                        stack.pop();
                    }else{
                        ans[i] = stack.peek();
                        break;
                    }
                }
                if(stack.isEmpty()){
                    ans[i]=-1;
                }
                stack.push(nums[i]);
            }
        }
        

        return ans;
        
    }
}