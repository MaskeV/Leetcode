class Solution {
    public boolean isHappy(int n) {
   if(n==1 || n==7){
    return true;
   }
  
   while(n>9){
     int sum=0,tmp;
    while(n>0){
      tmp = n%10;
      sum += tmp*tmp;
      n = n/10;
    }
    if(sum == 1 || sum==7){
        return true;
    }
    n = sum;
   }
  return n==1 || n==7;
        
    }
}