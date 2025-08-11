class Solution {
    public boolean isPalindrome(int x) {
    
        if(x<0){
            return false;
        }
       int temp = x;
        int reversedNumber = 0;
        while(x>0){
            int lastNumber  = x%10;
            reversedNumber=reversedNumber*10+lastNumber;
            x/=10;
        }
        
        return reversedNumber == temp;

        
        
    }
}