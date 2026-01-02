class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder sb = new StringBuilder();
        int  count=0;
        int id=1;

        for(int i=0;i<s.length();i++){
           
            if(s.charAt(i)=='('){
                count++;
            }else{
                count--;
            }
             if(count==0){
                if(id<=i){
                sb.append(s.substring(id,i));
                }
                id=i+2;
            }

        }
        return sb.toString();
    }
}