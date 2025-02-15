class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
       
       int mid = -1;
       int l=1,h=x;
       while(l <= h){

        mid = l+(h-l)/2;

        if((long) mid * mid > (long) x){
            h = mid-1;
        }

        else if (mid * mid == x){
            return mid;
        }

        else{
            l = mid+1;
        }
       }
       return Math.round(h);

    }
}