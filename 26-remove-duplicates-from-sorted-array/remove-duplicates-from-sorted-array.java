class Solution {
    public int removeDuplicates(int[] arr) {
        HashSet<Integer> hset = new HashSet<>();
      
        for(int i=0;i<arr.length;i++){
           hset.add(arr[i]);
        }
        System.out.println(hset);
        int index=0;
       
         TreeSet<Integer> tset = new TreeSet<>(hset);
          for(int value:tset){
            arr[index] = value;
            index++;
        }

        return index;

    }
}