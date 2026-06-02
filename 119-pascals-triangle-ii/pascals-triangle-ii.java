class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            ans.add(getNcr(rowIndex,i));
        }
        return ans;
        
    }

    public int getNcr(int n,int c){
        long  res = 1;
        for(int i=0;i<c;i++){
            res *= (n-i);
            res/=(i+1);
        }
        return (int)res;
    }
}
