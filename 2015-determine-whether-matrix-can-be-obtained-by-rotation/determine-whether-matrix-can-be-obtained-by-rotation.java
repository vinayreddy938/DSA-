class Solution {
    public boolean findRotation(int[][] matrix, int[][] target) {
        int n = matrix.length;
       for(int k=0;k<4;k++){
         for(int i=0;i<matrix.length-1;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
         
                reverse(matrix[i]);
            
        }
        boolean  isMatrix = true;
        for(int i=0;i<matrix.length;i++){
        
         
                for(int j=0;j<matrix.length;j++){
                    if(matrix[i][j]!=target[i][j]){
                        isMatrix = false;
                        break;

                    }
                }
              

            
        }
        if(isMatrix){
            return true;
        }
       
        }
        return false;
        
        
        
    }
    public void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}