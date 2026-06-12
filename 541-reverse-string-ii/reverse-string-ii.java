class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for(int i=0;i<s.length();i+=(2*k)){
            int min = Math.min(k,s.length()-i);
            int start = i;
            int end = i+min-1;
            while(start<end){
              char  temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp; 
                start++;
                end--;
            }
      
        }


        return  String.valueOf(arr);
        
    }
}