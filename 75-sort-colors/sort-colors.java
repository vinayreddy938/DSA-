class Solution {
    public void sortColors(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int pointer = 0;
        while(pointer <= j){
            if(arr[pointer]==0){
                swap(arr,pointer,i);
                i++;
                pointer++;
             
            }else if(arr[pointer]==2){
                 swap(arr,pointer,j);
                 j--;
               
               


            }else if(arr[pointer]==1){
                 pointer++;
               
               
            }
              
        }
    
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}