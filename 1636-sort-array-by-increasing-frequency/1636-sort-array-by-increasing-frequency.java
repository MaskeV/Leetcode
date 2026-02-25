class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
     Integer[] tempArr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
     Arrays.sort(tempArr, 
     (i,j)->{
       if(map.get(i)!=map.get(j)){
        return map.get(i)-map.get(j);
       }
       return j-i;
     }
     );

     for(int i=0;i<nums.length;i++){
        nums[i]=tempArr[i];
     }
     return nums;

    }
}