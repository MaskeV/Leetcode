class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        int min = 100; int max =0;
        int[] freq = new int[101];

        for(int i:nums){
            if(min>i){
              min =i;
            }
            if(max<i){
                max = i;
            }
            freq[i]++;
        }
        

        for(int i=min;i<=max;i++){
            if(freq[i]!=1){
               ans.add(i);
            }
        }

        return ans;
    }
}