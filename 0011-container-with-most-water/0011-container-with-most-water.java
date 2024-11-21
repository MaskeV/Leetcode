class Solution {
    public int maxArea(int[] height) {
    int left=0;
    int right=height.length-1;
    int max=0;

    while(left<right){
        int current = Math.min(height[left],height[right])*(right-left);
        max = Math.max(current,max);
        if(Math.max(height[left],height[right])==height[left]){
            right--;

        }else{
            left++;
        }



    }
    return max;
    }
}
            
