class Solution {
    public int hIndex(int[] citations) {

        int[] freq = new int[1001];
        int max=0;

        for(int i:citations){
            for(int j=0;j<=i;j++){
            freq[j]++;
            }
            if(max<i){
                max=i;
            }
        }
        

        for(int i=max;i>=0;i--){
            if(freq[i]>=i){
                return i;
            }
        }

        return 1;
    }
}