class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int sum=0;
        for(List<Integer> l:triangle){
            int min=Integer.MAX_VALUE;
            for(int i:l){
               min = Math.min(min,i);
            }
            sum+=min;
        }
          return sum;
    }
}