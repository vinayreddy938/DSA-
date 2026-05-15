class Solution {
    public int diagonalSum(int[][] mat) {
        int leftDiagnolSum =0;
        int mid = mat.length/2;
        int rightDiagnolSum  = 0;
        for(int i=0;i<mat.length;i++){
            
                 leftDiagnolSum+=mat[i][i];
                 System.out.println("left diagnol "+mat[i][i]);

            
          

        }
      for(int i=0;i<mat.length;i++){
    rightDiagnolSum += mat[i][mat.length - 1 - i];
}
        return mat.length%2==1?leftDiagnolSum+rightDiagnolSum-mat[mid][mid]:leftDiagnolSum+rightDiagnolSum;
        
    }
}