// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {
//         int max=0;
//         for(int i=0;i<piles.length;i++){
//             max = Math.max(max,piles[i]);
//         }
//         int l=1;
//         int r=max;
//         int ans=max;

//         while(l<=r){
//             int mid = l+(r-l)/2;
//             int sum=0;
//             for(int i=0;i<piles.length;i++){
//                 sum += (piles[i] + mid - 1) / mid;
//             }
//             if(sum<=h){
//                 ans=mid;
//                 r=mid-1;
//             }else if(sum>h){
//                 l=mid+1;
//             }
//         }

       
//         return ans;
//     }
// }




class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int p : piles) max = Math.max(max, p);

        int l = 1, r = max;
        int ans = max;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            long hours = 0L; // use long to avoid overflow
            for (int p : piles) {
                hours += (p + mid - 1) / mid;  // ceil(p / mid) with integers
                if (hours > h) break;          // early exit speeds up & avoids overflow
            }

            if (hours <= h) {
                ans = mid;      // mid works; try smaller speed
                r = mid - 1;
            } else {
                l = mid + 1;    // need faster speed
            }
        }
        return ans;
    }
}
