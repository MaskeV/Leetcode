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
      int id =0;
      for(int i =0;i<nums.length;i++){

        if(nums[i] != val){
            nums[id] =  nums[i];
            id++;
            count++;
        }

      }

      return count;
    

    }
}