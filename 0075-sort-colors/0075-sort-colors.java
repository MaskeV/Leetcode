class Solution {
    public void sortColors(int[] nums) {
        // Map<Integer,Integer> count = new HashMap<>();
       


        // for(int num:nums){
        //     count.put(num,count.getOrDefault(num,0)+1);
        // }

        // int idx =0;
        // for(int i=0;i<3;i++){
        //     int freq = count.getOrDefault(i,0);
        //     for(int j=0;j<freq;j++){
        //         nums[idx] = i;
        //         idx++;
               
        //     }
        // }


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