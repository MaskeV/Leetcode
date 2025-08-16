class Solution {
    public int minCostToMoveChips(int[] position) {
        int even=0;
        int odd=0;

        for(int i=0;i<position.length;i++){
            position[i]=position[i]%2;
            if(position[i]==0){
                even++;
            }else{
                odd++;
            }
        }
        if(even>odd){
            return odd;
        }
        return even;

    }
}