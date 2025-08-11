class Solution {
    public int removeElement(int[] arr, int val) {
      int length = 0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]!=val){
            int temp = arr[length];
            arr[length] = arr[i];
            arr[i] = temp;
            length++;
          
        }
      }
      return length;
     
    }
  
}