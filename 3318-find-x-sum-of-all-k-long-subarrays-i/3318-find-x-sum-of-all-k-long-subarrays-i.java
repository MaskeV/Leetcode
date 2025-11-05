class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n=nums.length;
        int ans[] = new int[n-k+1];
        for(int i=0;i<n-k+1;i++){
           Map<Integer,Integer> map = new HashMap<>();
           for(int j=i;j<i+k;j++){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
           }
           List<int[]> l = new ArrayList<>();
           for(int key:map.keySet()){
            l.add(new int[]{map.get(key),key});
           }
           Collections.sort(l, (a,b)-> b[0]!=a[0] ? b[0]-a[0]:b[1]-a[1]);
           int sum=0;
           for(int j=0;j<x && j<l.size();j++){
            sum+=(l.get(j)[1] * l.get(j)[0]);
           }
              ans[i]+=sum;
        }
        return ans;
    }
}