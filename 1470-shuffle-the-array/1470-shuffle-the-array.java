// class Solution {
//     public int[] shuffle(int[] nums, int n) {
//         int[] rotate = new int[nums.length];

//         for(int i=0;i<n;i++){
//             rotate[2*i]=nums[i];
//             rotate[2*i+1]=nums[i+n];
//         }
// //         int id=0;
// //         for(int i=0;i<n;i++){
// //   rotate[id]=nums[i];
// //   rotate[id+1]=nums[i+n];
// //   id+=2;
// //         }
//         return rotate;
//     }
// }

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int maxVal = 10000; // larger than any number in nums
        // Step 1: Encode
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + nums[i + n] * maxVal;
        }
        // Step 2: Decode in reverse order to avoid overwriting
        for (int i = n - 1; i >= 0; i--) {
            nums[2 * i + 1] = nums[i] / maxVal; // y
            nums[2 * i] = nums[i] % maxVal;     // x
        }
        return nums;
    }
}
