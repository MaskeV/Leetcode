class Solution {
    public int maxDistance(int[] colors) {
      //  int n = colors.length;
        //int max = 0;
    //for(int i=0;i<n;i++){
      //  for(int j=n-1;j>=i;j--){
        //    if(colors[i]!=colors[j]){
          //      int dis = j-i;
            //    max = Math.max(max,dis);
              //  break;
            //}
   //     }
 //   }
        

       int left=0;
       int right=colors.length-1;
       int max=0;

        while(colors[left]==colors[right]){
            right--;
        }

        max  =  right-left;

        right = colors.length-1;

        while(colors[left]==colors[right]){
            left++;
        }

        max = Math.max(right-left,max);
        return max;
    }
}