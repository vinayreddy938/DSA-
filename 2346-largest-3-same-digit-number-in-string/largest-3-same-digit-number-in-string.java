class Solution {
    public String largestGoodInteger(String num) {
        int i=0;
        int j= 1;
        int k= 2;
        String result = "";
        int max =Integer.MIN_VALUE;
        while(i<num.length() && j<num.length() && k<num.length()){
            char ch1 = num.charAt(i);
            char ch2 = num.charAt(j);
            char ch3 = num.charAt(k);
            if(ch1==ch2&& ch2==ch3){
               String result2= ""+ch1+ch2+ch3;
                int num2 = Integer.parseInt(result2); 
                if(num2>max){
                    max = num2;
                    result = result2;
                }
               

            }
            i++;
            k++;
            j++;
        }

        return result;

        
    }
}