class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0, sumEven=0;
        int odd=1;
        int even =2;
        for(int i=0;i<n;i++){
            sumEven += even;
            even =even+2;
            sumOdd += odd;
            odd = odd+2;
        }

      return gcd(sumEven, sumOdd);

    }

    int gcd(int a,int b){

        for(int i=Math.min(a,b);i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }

        return 1;
    }
}