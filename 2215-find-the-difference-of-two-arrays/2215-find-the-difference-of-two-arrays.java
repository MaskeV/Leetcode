class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
 List<List<Integer>> ans = new ArrayList<>();
 ans.add(new ArrayList<>());
 ans.add(new ArrayList<>());
        for(int i=0;i<nums1.length;i++){
            int flag=0;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                  flag =1;
                }
            }
            if(flag!=1 && !(ans.get(0).contains(nums1[i]))){

                
                ans.get(0).add(nums1[i]);
            }
        }
           for(int i=0;i<nums2.length;i++){
            int flag=0;
            for(int j=0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                  flag =1;
                }
            }
            if(flag!=1 && !(ans.get(1).contains(nums2[i]))){

                ans.get(1).add(nums2[i]);
            }
        }
    return ans;


    

        
    }

}