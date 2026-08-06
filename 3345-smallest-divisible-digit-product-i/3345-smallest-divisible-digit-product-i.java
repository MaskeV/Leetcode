class Solution {
    public int smallestNumber(int n, int t) {
        int i=n;
       while(i>=n){
        int product = productOfDigit(i);
         if(product%t==0){
            return i;
         }
         i++;
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