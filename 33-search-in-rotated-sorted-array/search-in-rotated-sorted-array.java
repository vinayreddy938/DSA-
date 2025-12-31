class Solution {
    public int search(int[] arr, int target) {
        if(arr.length==1 && target==arr[0]){
            return 0;
        }
        int start = 0;
        int end = 0;
        int secondStart = 0;
        int secondEnd = arr.length-1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                end = i;
                break;
            }
        }
        secondStart = end+1;


        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]==target){
                return mid;
            }
        }
        
        while(secondStart<=secondEnd){
            int mid = secondStart+(secondEnd-secondStart)/2;
            if(arr[mid]<target){
                secondStart=mid+1;
            }else if(arr[mid]>target){
                secondEnd=mid-1;
            }else if(arr[mid]==target){
                return mid;
            }
        }
       
        return -1;

      
        
    }

}