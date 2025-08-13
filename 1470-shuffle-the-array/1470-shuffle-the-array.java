class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] rotate = new int[nums.length];
        int id=0;
        for(int i=0;i<n;i++){
  rotate[id]=nums[i];
  rotate[id+1]=nums[i+n];
  id+=2;
        }
        return rotate;
    }
}