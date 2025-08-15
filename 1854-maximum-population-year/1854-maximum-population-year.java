class Solution {
    public int maximumPopulation(int[][] logs) {
       int[] year=new int[2051];
       for(int[] log:logs){
        year[log[0]]++;
        year[log[1]]--;
       }
       int maxCount=year[1950],maxYear=1950;
       for(int i=1951;i<2051;i++){
        year[i]+=year[i-1];
        if(maxCount<year[i]){
            maxCount=year[i];
            maxYear=i;
        }
       }
       return maxYear;
    }
}