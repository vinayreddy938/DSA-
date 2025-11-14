class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hmap = new HashMap<>();
        HashSet<Character> hset = new HashSet<>();
       StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(!hmap.containsKey(ch1)&&!hset.contains(ch2)){
                 hmap.put(ch1,ch2);
                 hset.add(ch2);
            }
           
        }
        for(int i=0;i<s.length();i++){
          result.append(hmap.get(s.charAt(i)));
        }
    
        
       
        
   return result.toString().equals(t);

    }
}