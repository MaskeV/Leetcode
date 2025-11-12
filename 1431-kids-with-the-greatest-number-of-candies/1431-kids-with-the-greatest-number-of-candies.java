class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List<Boolean> flags = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
        if(max<candies[i]){
          max=candies[i];
        }
       }

       for(int i=0;i<candies.length;i++){ 
           flags.add(candies[i]+extraCandies>=max);
       } 
       return flags;
    }
}