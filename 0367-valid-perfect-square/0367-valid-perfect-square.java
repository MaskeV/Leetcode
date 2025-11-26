class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2){
            return true;
        }
        int start=0;
        int end=num/2;
        while(start<=end){
            int mid = start+(end-start)/2;
            long sqr=(long) mid*mid;
            if(sqr>num){
              end=mid-1;
            }else if(sqr<num){
                start=mid+1;
            }else{
                return true;
            }
        
        }
        return false;
        
    }
}