// User function Template for Java

class Solution {

    String calc_Sum(int arr1[], int arr2[]) {
        // Complete the function
        int carry = 0;
        String ans="";
                int    i=arr1.length-1;
         int j=arr2.length-1;
       
        while(i>=0 && j>=0){
            int sum = arr1[i]+arr2[j]+carry;
            int lastNumber = sum%10;
            int firstNumber = sum/10;
            ans=lastNumber+ans;
            carry=firstNumber;
            i--;
            j--;
            
        }
        while(i>=0){
                int sum = arr1[i]+carry;
            int lastNumber = sum%10;
            int firstNumber = sum/10;
            ans=lastNumber+ans;
            carry=firstNumber;
             i--;
            
        }
          while(j>=0){
                int sum = arr2[j]+carry;
            int lastNumber = sum%10;
            int firstNumber = sum/10;
            ans=lastNumber+ans;
            carry=firstNumber;
             j--;
            
        }
        if(carry!=0){
            ans=carry+ans;
        }
        return ans;
        
    }
}
