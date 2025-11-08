class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length()-1;
    int count = 0;
    while(n>=0){
        char ch = s.charAt(n);
        if(ch!=' '){
            count++;
        }
        else if(count > 0){
            break;
        }

        n--;
    }
    return count;
        
    }
}