class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> arr2 = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=max){
                max = arr[i];
                arr2.add(max);
            }
            
        }
        int start = 0;
        int end = arr2.size()-1;
        while(start<end){
            int temp = arr2.get(start);
            arr2.set(start,arr2.get(end));
            arr2.set(end,temp);
            start++;
            end--;
        }
        return arr2;
    }
}
