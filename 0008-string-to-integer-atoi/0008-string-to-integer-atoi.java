class Solution {
   
    public int myAtoi(String s) {
     Boolean flag=true;
     int negative =1;
     long no=0;

      for(int i=0;i<s.length();i++){
        int temp=s.charAt(i);
        if(s.charAt(i)==' '  && flag){
            continue;
        }
        if(s.charAt(i)=='+' && flag){
            flag=false;
            continue;
        }
        if(s.charAt(i)=='-' && flag){
          negative=-1;
          flag=false;
        }
        else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
           
            if((no*10+s.charAt(i)-'0') *negative >= Integer.MAX_VALUE){
                return Integer.MAX_VALUE; 
            }if((no*10+s.charAt(i)-'0')*negative <=Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            no=no*10+(s.charAt(i)-'0');
            flag=false;
        }else{
            break;
        }

      }
      return (int) no*negative;

    }
}