class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> maxCol = new ArrayList<>();
        List<Integer> minRow  = new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++){
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                }
            }
            minRow.add(min);
        }
        int col=matrix[0].length;

         for(int i=0;i<col;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
                if(max<matrix[j][i]){
                    max=matrix[j][i];
                }
            }
            maxCol.add(max);
        } 

        List<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<minRow.size();i++){
            for(int j=0;j<maxCol.size();j++){
       if (matrix[i][j] == minRow.get(i) && matrix[i][j] == maxCol.get(j)) {
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
      
    }
}