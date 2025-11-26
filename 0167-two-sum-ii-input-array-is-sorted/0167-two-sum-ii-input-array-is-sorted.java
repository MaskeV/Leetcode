class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans= new int[2];
        int start=0;
        int  end = numbers.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=numbers[start]+numbers[end];
            if(sum>target){
                end--;
            }else if(sum<target){
                start++;
            }else{
                return  new int[] {start+1,end+1};
            }
            
        }
        return new int[] {0,0};
        
    }
}