class Solution {
    public void setZeroes(int[][] matrix) {
     int  rows = matrix.length;
     int cols = matrix[0].length;
     boolean zeroinFirstCol=false;

     for(int i=0;i<rows;i++){
        if(matrix[i][0]==0){
            zeroinFirstCol=true;
        }
        for(int j=01;j<cols;j++){
            if(matrix[i][j]==0){
                matrix[0][j]=0;
                matrix[i][0]=0;
            }
        }
        }
        for(int i=rows-1;i>=0;i--){
            for(int j=cols-1;j>=1;j--){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
            if(zeroinFirstCol){
                matrix[i][0] =  0;
            }
        }
    
    }
}




// class Solution {
//     public void setZeroes(int[][] matrix) {
//      int  rows = matrix.length;
//      int cols = matrix[0].length;

//      Set<Integer> zrows = new HashSet<>();
//      Set<Integer> zcols = new HashSet<>();

//      for(int i=0;i<rows;i++){
//         for(int j=0;j<cols;j++){
//             if(matrix[i][j]==0){
//                 zrows.add(i);
//                 zcols.add(j);
//             }
//         }
//      }

//      for(int i=0;i<rows;i++){
//         for(int j=0;j<cols;j++){
//             if(zrows.contains(i) || zcols.contains(j)){
//                 matrix[i][j]=0;
//             }
//         }
//      }


//     }
// }