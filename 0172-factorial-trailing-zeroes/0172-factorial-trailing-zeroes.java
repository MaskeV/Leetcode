class Solution {
    public int trailingZeroes(int n) {
       int count=0;
        while(n>0){
            count=count+n/5;
            n=n/5;
        } 

        return count;
   }

    //int factorial(int n){
        //if(n<=1){
         //   return 1;
       // }
     //   return n*factorial(n-1);
   // }
}