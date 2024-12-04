// class Solution {
//     public int maxProfit(int[] prices) {
//         int max=0;
//         for(int i=0;i<prices.length-1;i++){
//             for(int j=i+1;j<prices.length;j++){
//                 if(prices[j]>prices[i]){
//                     if(max<(prices[j]-prices[i])){
//                         max= prices[j]-prices[i];
//                     }
//                 }
//             }
//         }
//         return max;
        
//     }
// }

class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}