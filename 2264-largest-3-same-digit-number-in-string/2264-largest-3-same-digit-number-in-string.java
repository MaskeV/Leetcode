class Solution {
    public String largestGoodInteger(String num) {
        int max=0;
        int curr=0;
        boolean flag = false;
       for(int i=0;i<num.length()-2;i++){
         if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)){
          curr = (100*(num.charAt(i)-'0')) + (10*(num.charAt(i)-'0')) +(num.charAt(i)-'0');
          flag=true;
         }
         if(max<curr){
            max=curr;
         }
       }
       if(max==0 && flag){
        return "000";
       }else if(flag){
         return String.valueOf(max);
       }
       return "";
    }
}