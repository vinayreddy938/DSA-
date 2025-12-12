class Solution {
    public int evalRPN(String[] tokens) { 
        Stack<Integer> stack = new Stack<>();
        HashSet<String> hset = new HashSet<>();
        hset.add("+");
        hset.add("-");
        hset.add("*");
        hset.add("/");
        for(int i=0;i<tokens.length;i++){
            String  s = tokens[i];
            if(hset.contains(s)){
                int a = stack.pop();
                int b = stack.pop();
                int result = 0;
                if(s.equals("+")){
                     result = b+a;
                }else if(s.equals("-")){
                      result  = b-a;
                }else if(s.equals("*")){
                    result = b*a;
                }else{
                    result =( b/a);
                }
                stack.push(result);
               
            }else{
                stack.push(Integer.parseInt(s));
            }
        }

        return stack.pop();
        
        
    }
}