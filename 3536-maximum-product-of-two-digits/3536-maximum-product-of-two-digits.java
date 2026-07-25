class Solution {
    public int maxProduct(int n) {

        int mul=1;
        int max = 0, secondMax=0;

        while(n>0){
          int digit= n%10;
          if(digit>max){
            secondMax=max;
            max=digit;
          }else if(digit>secondMax){
            secondMax=digit;
          }
          n = n/10;
        }
        
        return max*secondMax;
    }
}