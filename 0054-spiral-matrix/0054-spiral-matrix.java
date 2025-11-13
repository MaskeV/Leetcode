class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       int rows = matrix.length;
       int cols = matrix[0].length;

       int row =0;
       int col=-1;

       int direction =1;

       List<Integer> res = new ArrayList<>();

       while(rows>0 && cols>0){
        for(int i=0;i<cols;i++){
                col+=direction;
                res.add(matrix[row][col]);
        }
        rows--;

            for(int j=0;j<rows;j++){
                row+=direction;
                res.add(matrix[row][col]);
        }
        cols--;
        direction *=-1;
       }

      return res;
    }
}