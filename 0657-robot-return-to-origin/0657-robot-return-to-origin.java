class Solution {
    public boolean judgeCircle(String moves) {

        Deque<Character> stack = new ArrayDeque<>();

        int dCount = 0;
        int rCount = 0;
        int lCount = 0;
        int uCount = 0;

        for(int i=0;i<moves.length();i++){
          if(moves.charAt(i)=='D'){
            dCount++;
          }else if(moves.charAt(i)=='L'){
            lCount++;
          }else if(moves.charAt(i)=='U'){
            uCount++;
          }else{
            rCount++;
          }
        }
        if(dCount == uCount && lCount == rCount){
            return true;
        }

        return false;
    }
}