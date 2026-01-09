class Solution {
    public List<String> buildArray(int[] target, int n) {
        int count =0;
        int no=1;
        List<String> ans = new ArrayList<>();
        int i=0;

        while(i<target.length){
            if(target[i]==no){
                ans.add("Push");
                no++;
                i++;
                continue;
            }
            ans.add("Push");
            ans.add("Pop");
            no++;
 
        }
         
  return ans;
        
    }
}