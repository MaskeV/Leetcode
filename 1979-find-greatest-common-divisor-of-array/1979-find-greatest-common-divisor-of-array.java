class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i:nums){
          if(i<min){
            min = i;
          }
          if(i>max){
            max= i;
          }
        }

         return gcd(min,max);
    }

    int gcd(int a,int b){
        for(int i=a;i>1;i--){
           if(a%i==0 && b%i==0){
            return i;
           }
        }

        return 1;
    }
}