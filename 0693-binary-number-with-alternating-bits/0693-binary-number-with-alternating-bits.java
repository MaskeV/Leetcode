class Solution {
    public boolean hasAlternatingBits(int n) {
        StringBuilder sb = new StringBuilder();

        while(n>0){
            sb.append(Integer.valueOf(n%2));
            n=n/2;
        } 

        for(int i=0;i<sb.length()-1;i++){
            if(sb.charAt(i)==sb.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}