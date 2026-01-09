class Solution {
    public int findMin(int[] arr) {
        int left = 0;
        int right = arr.length-1;
      
        if(arr[left]<=arr[right]){ //single element and  sorted case
            return arr[left];
        }
        while(left<=right){
            if(arr[left]<=arr[right]){ //single element and  sorted case
            return arr[left];
            }
            int mid = left+((right-left)/2);
            if(mid>0 && arr[mid]<arr[mid-1]){
                return arr[mid];
              
            }
            else if(arr[left]>arr[mid]){
                   right = mid-1;
            }else{
                left = mid+1;
             
            }
          
        }
  return 0;
        
    }
}