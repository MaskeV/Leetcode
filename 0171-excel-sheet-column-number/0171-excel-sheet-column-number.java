class Solution {
    public int titleToNumber(String columnTitle) {
        
        int temp=columnTitle.length()-1;
        int res=0;
        for(int i=0;i<columnTitle.length();i++){
            int id = columnTitle.charAt(i)-'A'+1;
            res+= id*Math.pow(26,temp);
            temp--;

        }
        return res;
        
    }
}