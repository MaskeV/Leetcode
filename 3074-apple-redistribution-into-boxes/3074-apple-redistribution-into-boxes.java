class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int appleCount=0;
        int count=0;
        for(int i=0;i<apple.length;i++){
            appleCount+=apple[i];
        }
        int sum=0;
        Arrays.sort(capacity);
        for(int i=capacity.length-1;i>0;i--){
            sum+=capacity[i];
            count++;
            if(sum>=appleCount){
                return count;
            }
        }
        return capacity.length;
    }
}