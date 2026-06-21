class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count =0;
        int sum=0;
        Arrays.sort(costs);

        for(int i:costs){
            sum+=i;
            if(sum>coins){
                break;
            }
            count++;
        }
        return count;
    }
}