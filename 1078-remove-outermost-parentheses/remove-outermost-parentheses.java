class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        String result = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                if(stack.size()>0){
                    result+=ch;

                }
                stack.push(ch);
            }else{
                stack.pop();
                if(stack.size()>0){
                    result+=ch;
                }
            }
        }
        return result;
    }
}