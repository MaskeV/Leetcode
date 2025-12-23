class Solution {
    public void sortColors(int[] nums) {
     //   Map<Integer,Integer> map=new HashMap<>();
       // for(int i:nums){
         //   map.put(i,map.getOrDefault(i,0)+1);
        //}
        //int id=0;
        //for(int i:map.keySet()){
          //  for(int j=0;j<map.get(i);j++){
            //    nums[id]=i;
              //  id++;
           // }
        //}
        //int count[]=new int[3];
        //for(int i=0;i<nums.length;i++){
         //  count[nums[i]]++;
        //}
        //int id=0;
        //for(int i=0;i<3;i++){
          //  for(int j=0;j<count[i];j++){
            //     nums[id]=i;
              //   id++;
            //}
        //}

        int low=0,high=nums.length-1;
         int mid=0;
        while(mid<=high){

            if(nums[mid]==0){           
            nums[mid]=nums[low];
            nums[low]=0;
            mid++;
            low++;
            }else if(nums[mid]==2){
                nums[mid]=nums[high];
                nums[high]=2;
                high--;
            }else{
               mid++;
            }
        }
       
    }
}