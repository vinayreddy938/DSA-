class Solution {
    public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); 
    List<int[]> ans = new ArrayList<>();
    int[] prev = intervals[0];
    for(int i=1;i<intervals.length;i++){ 
        int start = intervals[i][0];
        int end = intervals[i][1];
        //
        if(start<=prev[1]){
            int max  = Math.max(prev[1],end);
            prev[1]=max;

        }else{
            ans.add(prev);
            prev=intervals[i];

        }
       

    }
    ans.add(prev);
    return ans.toArray(new int[ans.size()][]);         

        
    }
}