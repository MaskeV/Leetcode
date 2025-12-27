class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

       //int n=matrix.length;
      //int m = matrix[0].length;
      //int i=0;
      //int j=m-1;
      //while(i<n && j>=0){
        //if(matrix[i][j]<target){
          // i++;  
        //}else if(matrix[i][j]>target){
          //j--;
        //}else{
          //  return true;
        //}
      //}
        //return false;



        int m=matrix.length;
        int n=matrix[0].length;
        int i=0;
        int j=m-1;

        while(i<=j){
            int mid = (i+j)/2;
            if(matrix[mid][0]<target && matrix[mid][n-1]>target){
                break;
            }else if(matrix[mid][0]>target){
               j=mid-1;
            }else{
                i=mid+1;
            }
        }
        int row=(i+j)/2;
        int l=0;
        int r=n-1;
         while(l<=r){
            int mid=(l+r)/2;
            if(matrix[row][mid]<target){
                l=mid+1;
            }else if(matrix[row][mid]>target){
                r=mid-1;
            }else{
                return true;
            }

         }
         return false;

        }

}