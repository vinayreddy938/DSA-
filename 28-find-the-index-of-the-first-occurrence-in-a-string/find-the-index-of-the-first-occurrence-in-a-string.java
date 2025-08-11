class Solution {
    public int strStr(String haystack, String needle) {
        int start = 0;
        int end = 0;
        int sub = 0;
        while(end<haystack.length() && sub<needle.length()){
            char ch1 = haystack.charAt(end);
            char ch2 = needle.charAt(sub);
            if(ch1 == ch2){
                end++;
                sub++;
            }else{
                start++;
                end = start;
                sub=0;
            }
        }


         return sub==needle.length()?start:-1;
    }
}