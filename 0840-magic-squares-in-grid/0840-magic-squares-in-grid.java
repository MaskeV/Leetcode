class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int i=0;i<=m-3;i++){
            for(int j=0;j<=n-3;j++){
                count+=isMagicTriangle(grid,i,j);
            }
        }
        return count;
       
    }
    int isMagicTriangle(int[][] grid,int r,int c){
        if(grid[(r+1)][(c+1)]!=5){
            return 0;
        }
        for(int i=r;i<r+3;i++){
          int rowSum=0;
          for(int j=c;j<c+3;j++){
            rowSum+=grid[i][j];
          }
          if(rowSum!=15){
            return 0;
          }
        }

        for(int i=c;i<c+3;i++){
            int columnSum=0;
          for(int j=r;j<r+3;j++){
            columnSum+=grid[j][i];
          }
          if(columnSum!=15){
            return 0;
          }
        }

        
        return 1;
    }
}