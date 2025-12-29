class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count=0;
        int i=0;
        int j=n-1;
        while(i<m){
            while(j>=0 && grid[i][j]<0){
               count++;
               j--;
            }
            i++;
            j=n-1;
        }
        return count;
    }
}