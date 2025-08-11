class Solution {
    public int removeDuplicates(int[] arr) {
        int unique = 0;
        for(int i=1;i<arr.length;i++){
          
            if(arr[unique]!=arr[i]){
                
                arr[unique+1] = arr[i];
                unique++;
            }
        }

        return unique+1;

    }
}