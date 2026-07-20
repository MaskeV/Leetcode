class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
       List<List<Integer>> ans = new ArrayList<>();
        while(k>0){
            for(int i=0;i<grid.length;i++){
                
                int last = grid[i][grid[i].length-1];
                for(int j=grid[i].length-1;j>0;j--){
                    grid[i][j] = grid[i][j-1];
                }

                grid[i][0]=last;
            }
            
            int last = grid[grid.length-1][0];
            for(int i=grid.length-1;i>0;i--){
               grid[i][0]=grid[i-1][0];
            }

            grid[0][0]=last;



            k--;
        }

        for(int[] arr : grid){
            List<Integer> list = new ArrayList<>();
            for(int i:arr){
                list.add(i);
            }
            ans.add(list);
        }

        return ans;
    }
}