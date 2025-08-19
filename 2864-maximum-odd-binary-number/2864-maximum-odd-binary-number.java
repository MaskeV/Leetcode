class Solution {
    public String maximumOddBinaryNumber(String s) {
    char[] chars = s.toCharArray();
    int countOne=0,countZero=0;
    for(char ch:chars){
        if(ch=='1'){
         countOne++;
        }else{
            countZero++;
        }
    }

    for(int i=chars.length-1;i>=0;i--){
        if(i==chars.length-1){
            chars[i]='1';countOne--;
        }
        else if(countZero!=0){
            chars[i]='0';
            countZero--;
        }
        else if(countOne!=0 && countZero==0){
            chars[i]='1';
            countOne--;
        }
        
    }
    return new String(chars);
        
    }
}