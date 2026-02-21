class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans=0;
        for(int i=left;i<=right;i++){

            int count=0;
            int no = i;
            while(no>0){
                if(no%2==1){
                    count++;
                }
                no=no/2;
            }
            if(isPrime(count)){
                ans++;
            }
        }
        return ans;
    }

   boolean isPrime(int n){
    int count=0;
    if(n<2){
        return false;
    }
    for(int i=2;i<=n/2;i++){
        if(n%i==0){
            count++;
        }
    }
    if(count==0){
        return true;
    }
    return false;
   }
}