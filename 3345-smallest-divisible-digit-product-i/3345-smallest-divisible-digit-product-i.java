class Solution {
    public int smallestNumber(int n, int t) {

      for(int i=n;i<n+t;i++){
        int product = productOfDigit(i);
         if(product%t==0){
            return i;
         }
       }

       return -1;
    }

    int productOfDigit(int n){
        int product=1;
        while(n>0){
            product *= n%10;
            n=n/10;
        }

        return product;
    }
}