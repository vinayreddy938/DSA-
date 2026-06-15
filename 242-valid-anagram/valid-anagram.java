class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] ch1 =s.toCharArray();
        char[]  ch2=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int x=0;
        while(x<s.length()){
            if(ch1[x]!=ch2[x]){
                return false;
            }
            x++;
        }
        return true;

        
    }
}