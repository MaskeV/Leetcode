class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int  temp=0;
        long sum=0;
        int n=happiness.length;
        Arrays.sort(happiness);
        for(int i=n-1;i>=n-k;i--){
            if(happiness[i]-temp>=0){
            sum=sum+(happiness[i]-temp);
            }
            temp++;

        }
        return sum;
    }
}