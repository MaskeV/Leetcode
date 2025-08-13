class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] rotate = new int[nums.length];

        for(int i=0;i<n;i++){
            rotate[2*i]=nums[i];
            rotate[2*i+1]=nums[i+n];
        }
//         int id=0;
//         for(int i=0;i<n;i++){
//   rotate[id]=nums[i];
//   rotate[id+1]=nums[i+n];
//   id+=2;
//         }
        return rotate;
    }
}