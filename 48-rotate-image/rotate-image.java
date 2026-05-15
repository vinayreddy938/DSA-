class Solution {
    public void rotate(int[][] arr) {

    
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[i].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
                System.out.println( arr[i][j]);
                 System.out.println( arr[i][i]);



            }
               
        }
        for(int i=0;i<arr.length;i++){
            reverse(arr[i]);

        }

        
    
    }
    public static void reverse(int[] arr){
        int first = 0;
        int second= arr.length-1;
        while(first<second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        first++;
        second--;


         }
    }
    
}