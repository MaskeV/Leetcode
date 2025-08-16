class Solution {
    public void setZeroes(int[][] matrix) {
     int  rows = matrix.length;
     int cols = matrix[0].length;

     Set<Integer> zrows = new HashSet<>();
     Set<Integer> zcols = new HashSet<>();

     for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(matrix[i][j]==0){
                zrows.add(i);
                zcols.add(j);
            }
        }
     }

     for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(zrows.contains(i) || zcols.contains(j)){
                matrix[i][j]=0;
            }
        }
     }


    }
}