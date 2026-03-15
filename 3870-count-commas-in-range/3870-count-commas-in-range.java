class Solution {
    public int countCommas(int n) {
        int orignal =n;
        int digit=0;
        while(n>0){
            digit++;
            n = n/10;
        }
        if(digit<4){
          return 0;
        }

   return orignal -1000+1;

    }
}