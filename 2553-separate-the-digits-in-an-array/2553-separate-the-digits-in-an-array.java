class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            List<Integer> temp = new ArrayList<>();

            while(nums[i]>0){
              temp.add(nums[i]%10);
              nums[i]=nums[i]/10;
            }

            for(int j=temp.size()-1;j>=0;j--){
              ans.add(temp.get(j));   
            }


        }

       int[] res = new int[ans.size()];
       int id=0;
       for(int i:ans){
        res[id]=i;
        id++;
       }
       return res;

    }
}