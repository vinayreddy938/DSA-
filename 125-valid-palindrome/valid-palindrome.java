class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int start =0;
        int end = s.length()-1;
        while(start<end){
            char ch1 = s.charAt(start);
            char ch2 = s.charAt(end);
            if(!Character.isLetterOrDigit(ch1)){
                start++;

            }else if(!Character.isLetterOrDigit(ch2)){
                end--;
            }else{ 
                if(ch1!=ch2){
                    return false;
                }
                start++;
                end--;

            }


        }
        return true;
    }
}