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


    int max =0;
    int i=0,j=height.length-1;

    while(i<j){
      int min = Math.min(height[i],height[j]);
        if(max<(j-i)*min){
            max = (j-i)*min;
        }
        if(height[i]<height[j]){
            i++;
        }else{
            j--;
        }
    }

    return max;
    }
}