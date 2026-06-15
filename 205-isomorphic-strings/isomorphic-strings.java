class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> hmap = new HashMap<>();
        HashSet<Character> hset  = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2=  t.charAt(i);
            if(hmap.containsKey(ch1)){
                if(hmap.get(ch1)!=ch2){
                    return false;
                }

            }else{
                if(!hset.contains(ch2)){
                    hmap.put(ch1,ch2);
                    hset.add(ch2);

                }else{
                    return false;
                }
                
            }

        }
        return true;
        
    }
}