class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
      for(int i=0;i<4;i++){
        if(Arrays.deepEquals(mat,target)){
          return true;
        }
        rotate(mat);
      }  
      return false;  
    }
    private void rotate(int[][] mat){
          int i=0,j=mat.length-1;
          while(i<j){
            int[] temp = mat[i];
            mat[i]=mat[j];
            mat[j]=temp;
            i++;
            j--;
          }
          for (int r = 0; r < mat.length; r++) { 
            for (int c = r + 1; c < mat.length; c++) {
                int tmp = mat[r][c];
                mat[r][c] = mat[c][r];
                mat[c][r] = tmp;
            }
          }


    }
}