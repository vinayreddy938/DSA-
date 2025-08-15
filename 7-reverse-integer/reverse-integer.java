class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        if(x<0){
            isNegative = true;

        }
        x = Math.abs(x);
        int reversedNumber = 0;
        while(x>0){
           
            int lastDigit = x%10;
              if (reversedNumber > (Integer.MAX_VALUE-lastDigit)/10 ){
                return 0;
            }
            reversedNumber =reversedNumber*10+lastDigit;
            x/=10;
            
        }

        return isNegative?(-1*reversedNumber):reversedNumber;
        
    }
}