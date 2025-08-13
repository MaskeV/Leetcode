class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] money:accounts){
            int total=0;
            for(int ele:money){
                total+=ele;
            }
            if(total>max){
                max=total;
            }
        }
        return max;
    }
}