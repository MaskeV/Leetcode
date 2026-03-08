class Solution {
    public int singleNumber(int[] nums) {
       int ans=0;
       for(int i=0;i<nums.length;i++){
        ans = ans ^ nums[i];
       }
       return ans;
    } 
}
// class Solution {
//     public int singleNumber(int[] nums) {
//         Map<Integer,Integer> map = new HashMap<>();
//         for(int i:nums){
//          map.put(i,map.getOrDefault(i,0)+1);
//         }
//   for(int i:map.keySet()){
//     if(map.get(i)==1){
//         return i;
//     }
//   }
//   return -1;
//     } 
// }

// for (int i = 0; i < nums.length; i++) {
//     boolean unique = true;
//     for (int j = 0; j < nums.length; j++) {
//         if (i != j && nums[i] == nums[j]) { // another match found
//             unique = false;
//             break;
//         }
//     }
//     if (unique) {
//         return nums[i];
//     }
// }
// return 0; 
