class Solution {
   
    public int myAtoi(String s) {
        final int high = Integer.MAX_VALUE;
        final int low = Integer.MIN_VALUE;
         int flag =1; long ans=0;
         boolean valid=true;
         for(int i=0;i<s.length();i++){
            if(valid && s.charAt(i)==' '){
                continue;
            }if(valid && s.charAt(i)=='+'){
                valid=false;
                continue;
            }
            if(valid && s.charAt(i)=='-' ){
                 valid=false;
                flag=-1;
            }else if(s.charAt(i)-'0'>=0 && s.charAt(i)-'0'<10){
                valid=false;
                ans=(ans*10)+s.charAt(i)-'0';
                if(ans * flag>= high){
            return high;
         }else if(ans * flag<=low){
            return low;
         }
            }else{
                break;
            }
           
         }
    
        return (int) (ans*flag);
    }
}