class Solution {
    public int removeElement(int[] nums, int val) {
      //int j=nums.length-1;
      //nt count =0;

      //while(i<=j){
        //if(nums[i]!=val){
          //  count++;
            //i++;
        //}

        //else{
          
          //int temp =nums[i] ;
          // nums[i]=nums[j];
           //nums[j]=temp;
           //j--;

     //   }
   //   }
 //     return count;  

    int count =0;
    int i=0;
    int j=nums.length-1;

    while(i<=j){
        if(nums[i]==val){
            nums[i]=nums[j];
            j--;
        }else{
            count++;
            i++;
        }
        
    }

    return count;





    }
}