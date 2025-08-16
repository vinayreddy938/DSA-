class Solution {
    public int maximum69Number (int num) {
       ArrayList<Integer> arr = new ArrayList<>();
    //    int max = num;
       int maxNumber = 0;
       while(num>0){
        arr.add(num%10);
        num/=10;
       }
       Collections.reverse(arr);
       for(int i=0;i<arr.size();i++){
        if(arr.get(i)==6){
            arr.set(i,9);
            break;
        }
       }
       for(int i=0;i<arr.size();i++){
        maxNumber =maxNumber*10+arr.get(i);
       }
       return maxNumber;


      

        
    }
}