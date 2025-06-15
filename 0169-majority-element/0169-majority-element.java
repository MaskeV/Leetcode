class Solution {
    public int majorityElement(int[] nums) {
    //   Arrays.sort(nums);
       int m=nums.length/2;
    //    return nums[m];


    // int count=0;
    // int candidate = 0;

    // for(int i: nums){
    //     if(count==0){
    //         candidate=i;
    //     }
    //      else if(i==candidate){
    //         count++;
    //     }
    //     count--;
    // }
    // return candidate;
    
    int count=0;
    int no=0;
    for(int i:nums){
       if(count==0){
       no=i;
       }
      else if(i==no){
        count++;
       }else{
        count--;
       }


    }
    return no;
    }
}