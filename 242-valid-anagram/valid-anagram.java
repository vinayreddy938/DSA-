class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(hmap.containsKey(ch)){
                int value = hmap.get(ch);
                hmap.put(ch,value+1);
            }else{
                hmap.put(ch,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!(hmap.containsKey(ch))){
                return false;
            }else if(hmap.get(ch)==0){
                return false;
            }
            else{
                int value = hmap.get(ch);
                hmap.put(ch,value-1);
            }
        }

        return true;
        
    }
}