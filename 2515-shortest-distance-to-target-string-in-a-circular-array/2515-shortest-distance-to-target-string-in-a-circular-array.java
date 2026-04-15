class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {

        int n = words.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<words.length;i++){
            if(words[(startIndex+i)%n].equals(target)){
              
              if(i<min){
                min = i;
              }
            }
              if(words[(startIndex-i+n)%n].equals(target)){
             
              if(i<min){
                min = i;
              }
            }
        }

        if(min == Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}