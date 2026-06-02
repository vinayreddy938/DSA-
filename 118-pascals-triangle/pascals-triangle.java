class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> currentRow = new ArrayList<>();
            for(int j=0;j<=i;j++){
                int currentNum = getNcr(i,j);
                currentRow.add(currentNum);

                
            }
            ans.add(currentRow);
        }
        return ans;
        
    }
    public int getNcr(int n,int r){
        int res = 1;
        for(int i=0;i<r;i++){
            res = res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
}