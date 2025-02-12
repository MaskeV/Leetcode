// class Solution {
//       private calculateSum(int a){
//             int sum =0;
//             while(a>0){
//                 sum += a%10;
//                 a /=10;
//             }
//         }
     

//     public int maximumSum(int[] nums) {
//         // Pair<Integer,Integer> [] digitSumPairs = new Pair[nums.length];
//         HashMap <Integer,Integer> temp = new HashMap<>();

//       for(int i=0;i<nums;i++){
//         int digitsum= calculate(nums[i]);
//         temp.put(nums[i],digitSum);
            
//         }
//         int max=0;
//         for(int i=0;i<nums.length;i++){
//             if(temp.get())

//         }

        
//     }
// }



class Solution {
    public int maximumSum(int[] nums) {
        int[] max = new int[82];
        int ans = -1;
        for (int x : nums) {
            int sum = 0;
            int temp = x;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (max[sum] != 0) {
                ans = Math.max(ans, x + max[sum]);
            }
            max[sum] = Math.max(max[sum], x);
        }
        return ans;
    }
}