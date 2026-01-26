class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int min= Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int temp = Math.abs(arr[i]-arr[i+1]);
            if(min>temp){
                min=temp;
            }

        }

        for(int i=0;i<arr.length-1;i++){
            int temp=Math.abs(arr[i]-arr[i+1]);
            if(temp==min){
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i+1]);
                ans.add(list);
            }
        }
        return ans;
    }
}