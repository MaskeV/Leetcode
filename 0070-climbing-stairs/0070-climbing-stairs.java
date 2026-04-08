class Solution {
    public int climbStairs(int n) {
      int prev = 1;
      int curr=1;
      int stairs =1;

      for(int i=2;i<=n;i++){
        stairs = prev + curr;
        prev = curr;
        curr=stairs;
      }
       return stairs;
    }
}