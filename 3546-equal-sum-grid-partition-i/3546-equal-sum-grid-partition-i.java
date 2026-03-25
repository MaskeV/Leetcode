class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n=grid.length;
        int m =grid[0].length;
        long total=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                total+=grid[i][j];
            }
        }
       
        long sum1 =0;
        long sum2=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum1=sum1+grid[i][j];
            }


         sum2=total-sum1;
        if(sum1==sum2){
            return true;
        }
        }

       sum1=0;
        sum2=0;
        
          for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum1=sum1+grid[j][i];
            }
 
         
        sum2=total-sum1;

        if(sum1==sum2){
            return true;
        }
        }



        return false;

        
    }
}