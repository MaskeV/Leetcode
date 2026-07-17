class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i:nums){
            set.add(i);
        }

        int max =0;

        for(int i:set){

            if(!set.contains(i-1)){
            int no=i;
            int count=1;
            while(set.contains(no+1)){
              no++;
              count++;
            }

            if(max<count){
                max = count;
            }
            }
        }

        return max;

       // Arrays.sort(nums);
        //int max =0;
       //for(int i=0;i<nums.length;i++){
        //int count =1;
         //for(int j=i;j<nums.length-1;j++){
           // if(nums[j+1]==nums[j]+1){
             //   count++;
            //}else if(nums[j]==nums[j+1]){
              //  continue;
            //}else{
              //   break;
            //}
         //}

         //if(count>max){
           // max=count;
         //}

        //}

        //return max;
    }
}