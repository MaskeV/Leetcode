class Solution {
    public int[] sumZero(int n){
        int[] ans = new int[n];
        int start = -(n/2);
        for(int i=0;i<n;i++){
            if(n%2!=0){
             ans[i]=start;
             start++;
            }else{
                if(start==0){
                    ans[i]=++start;
                    start++;
                }else{
                    ans[i]=start;
                    start++;
                }
            }

        }
        return ans;
    }
}