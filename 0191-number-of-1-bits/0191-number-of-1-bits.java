class Solution {
    public int hammingWeight(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0){
        if(n%2!=0){
            sb.append(n%2);
        }
            n=n/2;
        }
        return sb.length();
    }
}