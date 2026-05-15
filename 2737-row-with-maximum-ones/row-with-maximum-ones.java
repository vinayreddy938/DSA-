class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans = new int[2];
        int maxCount = 0;
        int index = 0;
        for(int i=0;i<mat.length;i++){
            int onesCount=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    onesCount++;

                }

            }
            if(onesCount>maxCount){
                maxCount=onesCount;
                index = i;

            }
        }
        ans[0] = index;
        ans[1] = maxCount;
        return ans;
    }
}