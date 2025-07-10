class Solution {
    public void sortColors(int[] nums) {
    //    Map<Integer,Integer> map = new HashMap<>();
    //    for(int i:nums){
    //     map.put(i,map.getOrDefault(i,0)+1);
    //    }
    //    int idx=0;
    //    for(int j=0;j<3;j++){
    //   for(int i=0;i<map.getOrDefault(j,0);i++)

    //   {
    //    nums[idx]=j;
    //    idx++;
    //   }
    //    }

        int low=0, high=nums.length-1,curr=0;

        while(curr<=high){
            if(nums[curr]==0){
                int temp = nums[low];
                nums[low]=nums[curr];
                nums[curr]=temp;
                low++;
                curr++;
            }
          else if(nums[curr]==1){
            curr++;
          }else{
            int temp = nums[high];
            nums[high]=nums[curr];
            nums[curr]=temp;
            high--;
            
      
          }
        }


    }
}