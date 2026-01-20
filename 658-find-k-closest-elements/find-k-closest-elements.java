class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int i=0;
        int j=k;
        while(i<arr.length && j< arr.length){
            if((x-arr[i])>arr[j]-x){
                i++;
                j++;

            }else{
                break;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int l=i;l<j;l++){
            ans.add(arr[l]);
        }

        return ans;
  
        
    }
}