class Solution {
    public int strStr(String haystack, String needle) {

         for(int i=0;i<haystack.length();i++){
            String sub = haystack.charAt(i)+"";
            for(int j=i+1;j<haystack.length();j++){
                if(sub.equals(needle)){
                    return i;
                }
                sub+=haystack.charAt(j)+"";
            }
             if(sub.equals(needle)){
                    return i;
                }
         }


         return -1;
    }
}