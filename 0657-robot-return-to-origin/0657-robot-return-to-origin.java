class Solution {
    public boolean judgeCircle(String s) {
       int l=0,u=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
               l++;
            }else if(s.charAt(i)=='R'){
               l--;
            }else if(s.charAt(i)=='U'){
                u++;
            }else{
                u--;
            }
        }
        return l==0 && u==0;
    }
}