class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];
        for(int i=1;i<n;i++){
          String a = String.valueOf(i);
          String b = String.valueOf(n-i);
          if(!a.contains("0") && !b.contains("0")){
            ans[0]=i;
            ans[1]=n-i;
          }
        }
        return ans;
    }
}