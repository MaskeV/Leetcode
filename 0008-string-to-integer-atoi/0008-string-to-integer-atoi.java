class Solution {
    public int myAtoi(String s) {

     int INT_MAX=Integer.MAX_VALUE;
     int INT_MIN=Integer.MIN_VALUE;

      int i = 0;
      int n = s.length();

      while(i<n && s.charAt(i)==' '){
        i++;
      }

      if(i==n){
        return 0;
      }

      int sign=1;
      if(s.charAt(i)=='+'){
        i++;
      }else if(s.charAt(i)=='-'){
        sign = -1;
        i++;
      }
      long res =0;
      while(i<n && Character.isDigit(s.charAt(i))){
        int digit = s.charAt(i)-'0';
        res = res*10+digit;
        if(sign==-1 && sign*res<INT_MIN){
            return INT_MIN;
        }
        if(sign==1 && sign*res>INT_MAX){
            return INT_MAX;
        }
        i++;
      }
      return (int)(sign*res);
    }
}


// class Solution {
//     public int myAtoi(String s) {
//         int ans=0;
//         boolean negative=false;
//         boolean leadingZero=true;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)==' '){
//                 continue;
//             }if(s.charAt(i)=='-'){
//                 negative=true;
//             }else if(s.charAt(i)=='0' && leadingZero){
//                 continue;
//             }else if(s.charAt(i)-'0'>9){
//                 break;
//             }
//             else if(s.charAt(i)!='0' || !leadingZero){
//                 ans = ans*10 + (s.charAt(i)-'0');
//                 leadingZero=false;
//             }
//         }
//         if(negative){
//             return ans*-1;
//         }
//         return ans;
//     }
// }