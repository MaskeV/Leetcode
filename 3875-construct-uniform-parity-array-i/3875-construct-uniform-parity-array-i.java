class Solution {
    public boolean uniformArray(int[] nums1) {

       boolean flag = true;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0){
                continue;
            }else{
                 boolean even = false;
                for(int j=0;j<nums1.length ; j++){

                    if(i==j){
                        continue;
                    }
                  if((nums1[i]-nums1[j])%2==0){
                    even=true;
                    break;
                  }
                }

                if(!even){
                    flag=false;
                    break;
                }
            }
        }

        if(flag){
            return true;
        }

        flag=true;

        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2!=0){
                continue;
            }else{
                 boolean odd = false;
                for(int j=0;j<nums1.length; j++){

                    if(j==i){
                        continue;
                    }
                  if((nums1[i]-nums1[j])%2!=0){
                    odd=true;
                    break;
                  }
                }

                if(!odd){
                    flag=false;
                    break;
                }
            }
        }

        if(flag){
            return true;
        }
        return false;
    }
}
