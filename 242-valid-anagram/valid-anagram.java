class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            if(hmap.containsKey(ch1)){
                hmap.put(ch1,hmap.get(ch1)+1);
            }else{
                hmap.put(ch1,1);
            }
        }
        for(int j=0;j<t.length();j++){
            char ch2 = t.charAt(j);
            if(hmap.containsKey(ch2)){
                if(hmap.get(ch2)<=0){
                    return false;
                }
                hmap.put(ch2,hmap.get(ch2)-1);
            }else{
                return false;
            }
        }
        return true;
        
    }
}