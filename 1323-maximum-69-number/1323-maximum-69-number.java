class Solution {
    public int maximum69Number (int num) {
       StringBuilder no = new StringBuilder (String.valueOf(num));
       for(int i=0;i<no.length();i++){
        if(no.charAt(i)=='9'){
            continue;
        }else{
            no.replace(i,i+1,"9");
            break;
        }
       }
        return Integer.valueOf(no.toString());
    }
}