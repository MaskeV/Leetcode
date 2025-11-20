class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n= bits.length;
        if(n==1){
            return true;
        }
        if(n%2==1){
            return true;
        }
        if(bits[n-2]==0){
            return true;
        }
        return false;
    }
}