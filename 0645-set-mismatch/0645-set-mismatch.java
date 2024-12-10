class Solution {
    public int[] findErrorNums(int[] a ){
        Arrays.sort(a);
        int n = a.length;
        int duplicate = 0;
        long sum = 0;
    )
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(i>0 &&a[i]==a[i-1]){
               duplicate = a[i];
            }
            sum = sum+a[i];
        }
        // Calculate missing number
        long total = (long)n * (n + 1) / 2;
        int missing = (int) (total - (sum - duplicate));

        return new int[]{duplicate, missing};
        
    }
}