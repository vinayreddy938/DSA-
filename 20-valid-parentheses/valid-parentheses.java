class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();//O(n)
        HashMap<Character,Character> hmap = new HashMap<>();//constant
        hmap.put('{','}');
        hmap.put('(',')');
        hmap.put('[',']');
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(hmap.containsKey(ch)){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(hmap.get(top)!=ch){
                    return false;
                }
            }
            
        }
        return stack.size()==0;
    }
}