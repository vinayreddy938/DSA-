class Solution {
    public boolean isValid(String n) {
       
        HashMap<Character,Character> hmap = new HashMap<>();
        hmap.put('(',')');
        hmap.put('{','}');
        hmap.put('[',']');
        Stack<Character> s = new Stack<>();
        for(int i=0;i<n.length();i++){
            char ch = n.charAt(i);
            if(hmap.containsKey(ch)){
                s.push(ch);
            }else{ 
                if(s.isEmpty()){
                    return false;
                }
                char ch2 = s.pop();
                if(hmap.get(ch2)!=ch){
                    
                    return  false;
                }
            }
        }
        return s.isEmpty();
        
    }
}