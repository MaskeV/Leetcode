class Solution {
    public boolean checkDivisibility(int n) {

        if(n%(digitSum(n)+digitProduct(n))==0){
            return true;
        }

        return false;
        
    }

    int digitSum(int n){
       int sum = 0;
       while(n>0){
        sum += n%10;
        n = n/10;
       } 

       return sum;
    }

     int digitProduct(int n){
       int product = 1;
       while(n>0){
        product *= n%10;
        n = n/10;
       } 

       return product;
    }
}