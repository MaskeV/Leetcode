class Solution {
    public int maxArea(int[] height) {
        //int max =0;
        //for( int i=0;i<height.length;i++){
          //  for(int j=0;j<height.length;j++){

        //        int min = Math.min(height[i],height[j]);
      //          if(min*(j-i)>max){
    //                max=min*(j-i);
  //              }
//
        //    }
      //  }
    //    return max;

       int i=0;
       int j=height.length-1;
       int max=0;

       while(i<j){
         int curr = Math.min(height[i],height[j])*(j-i);

         if(max<curr){
            max=curr;
         }
         if(height[i]>height[j]){
            j--;
         }
         else{
            i++;
         }
       }

       return max;
    }
}