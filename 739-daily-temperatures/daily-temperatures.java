class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        ans[ans.length-1] = 0;
        stack.push(arr.length-1);
        for(int i=ans.length-2;i>=0;i--){
            if(arr[i]<arr[stack.peek()]){
                ans[i] = stack.peek()-i;
            }else{
                while(!stack.isEmpty()){
                    if(arr[stack.peek()]<=arr[i]){
                        stack.pop();
                    }else{
                        ans[i] = stack.peek()-i;
                        break;
                    }
                }
                if(stack.isEmpty()){
                    ans[i]=0;
                }
            }
            stack.push(i);
        }
        return ans;
        
    }
}