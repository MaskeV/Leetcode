 class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i]) && i-map.get(nums[i])<=k){
            return true;
        }
        map.put(nums[i],i);
       
        }
        return false;
    }
 }
//   class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         HashSet<Integer> set = new HashSet<>();
//         int j=0;
//         int max=0;
//         for(int i=0;i<nums.length;i++){
//             if(!set.add(nums[i])){
//                return true;
//             }
//             if(set.size()>k){
//               set.remove(nums[j]);
//               j++;
//             }
//             set.add(nums[i]);
//         } 
//     }
//   }

// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         if(nums==null || nums.length<2||k==0){
//             return false;
//         }
//        int i=0;
//        HashSet <Integer> set = new HashSet<>();
//        for(int j=0;j<nums.length;j++){
//         if(!set.add(nums[j])){
//             return true;
//         }
//         if(set.size() >=k+1){
//             set.remove(nums[i++]);
//         }
//        }
//        return false;
//     }
// }