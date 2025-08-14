class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] nums:image){
        int i=0,j=nums.length-1;
        while(i<=j){
            int temp = nums[i]^1;
            nums[i]=nums[j]^1;
            nums[j]=temp;
            i++;
            j--;
        }
        }
     
 return image;
        
    }
    
}