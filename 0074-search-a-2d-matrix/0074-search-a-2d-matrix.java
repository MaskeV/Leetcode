class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
           
      int i=0;
      
      while(i<m && matrix[i][n-1]<target){
              i++;
       }

       if(i==m){
         return false;
       }

        int low =0;int high = n-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(matrix[i][mid]>target){
                high = mid-1;
            }else if(matrix[i][mid]<target){
               low = mid+1;
            }else{
                return true;
            }
        }


      return false;
        
    }
}