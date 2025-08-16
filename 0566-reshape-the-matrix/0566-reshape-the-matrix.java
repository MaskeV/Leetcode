class Solution{
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;

        if(r*c!=m*n){
          return mat;
        }

        int[][] res = new int[r][c];
        for(int i=0;i<m*n;i++){
           res[i/c][i%c]=mat[i/n][i%n];
        }

        return res;

    }

}


// class Solution {
//     public int[][] matrixReshape(int[][] mat, int r, int c) {
//         if(r*c!=(mat.length*mat[0].length)){
//             return mat;
//         }
        

//         int[][] res = new int[r][c];
//        List<Integer> l = new ArrayList<>();
//        for(int i=0;i<mat.length;i++){
//         for(int j=0;j<mat[0].length;j++){
//           l.add(mat[i][j]);
//         }
//        }
//        int idx=0;

//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 if(idx<l.size()){
//             res[i][j]= l.get(idx);
//             idx++;
//                 }
//             }
//         }
        
//         return res;
        
//     }
// }