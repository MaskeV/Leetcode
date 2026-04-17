class Solution {
    public int minMirrorPairDistance(int[] nums) {
        //int min =Integer.MAX_VALUE;

        //for(int i=0;i<nums.length;i++){
          //  int reverse = reverseNumber(nums[i]);
            //for(int j=i+1;j<nums.length;j++){
              //  if(reverse == nums[j]){
                //    min = Math.min(min,Math.abs(i-j));
                //}
          //  }
        //}
        //if(min==Integer.MAX_VALUE){
          //  return -1;



          int min = Integer.MAX_VALUE;
          Map<Integer,Integer> map = new HashMap<>();

          for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
               min = Math.min(min,Math.abs(i-map.get(nums[i])));
            }
            int reverse= reverseNumber(nums[i]);
            map.put(reverse,i);
        }

        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }

    int reverseNumber(int no){
        int reverse =0;
        while(no>0){
            reverse = reverse*10 + no%10;
             no = no/10;
        }
        return reverse;
    }
}