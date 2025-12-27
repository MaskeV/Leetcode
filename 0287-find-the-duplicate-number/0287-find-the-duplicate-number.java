class Solution {
    public int findDuplicate(int[] nums) {
    //     Set<Integer> set = new HashSet<>();
    //    for(int i:nums){
        
    //     if(!set.add(i)){
    //         return i;
    //     }
    //      set.add(i);
       
    //    }
    //    return 0;
    int n =nums.length;
    int [] count=new int[n];
    for(int i=0;i<n;i++){
        count[nums[i]]++;
        if(count[nums[i]]>1){
            return nums[i];
        }
    
    }
    return 0;
    }

    
}