class Solution {
    public void moveZeroes(int[] arr) {
       int zero = 0;
       int notAnZero = 0;
       while(zero<arr.length && notAnZero<arr.length){
        if(arr[zero]==0 && arr[notAnZero]==0){
            notAnZero++;
        }else if(arr[notAnZero]!=0&&arr[zero]==0 )
        {
            int temp = arr[zero];
            arr[zero] = arr[notAnZero];
            arr[notAnZero] = temp;
            zero++;

        }else{
            zero++;
            notAnZero++;
        }
       }
        
    }
}