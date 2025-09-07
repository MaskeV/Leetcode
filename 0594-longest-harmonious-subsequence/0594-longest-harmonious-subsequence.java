// class Solution {
//     public int findLHS(int[] nums) {
//         int max=0;
//         for(int i=0;i<nums.length;i++){
//            int count =0;
//            boolean flag=false;
//             for(int j=0;j<nums.length;j++){
//                 if(nums[j]-nums[i]==1  || nums[i]==nums[j]){
//                     count++;
//                     if(nums[j]-nums[i]==1){
//                         flag = true;
//                     }
//                 }
//             }
//             if(flag){
//             max= Math.max(count,max);
//             }
//         }
//         return max;
        
//     }
// }

class Solution {
    public int findLHS(int[] nums) {
        int sum=0;
        int max=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
       
    for(int i:map.keySet()){
        if(map.keySet().contains(i+1)){
          sum = map.get(i)+map.get(i+1);
        }
        max=Math.max(max,sum);
    }
    return max;
    }
}


