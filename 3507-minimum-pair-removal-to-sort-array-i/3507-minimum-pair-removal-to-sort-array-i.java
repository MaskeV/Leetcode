class Solution {
    public int minimumPairRemoval(int[] nums) {
         int count=0;
         List<Integer> temp = new ArrayList<>();
         for(int i:nums){
            temp.add(i);
         }

         while(!isAscending(temp)){
            int min =  Integer.MAX_VALUE;
           

            int minId=0;
            int min2Id=0;

            for(int i=0;i<temp.size()-1;i++){
                if(temp.get(i)+temp.get(i+1)<min){
                    min = temp.get(i)+temp.get(i+1);
                    minId=i;
                    min2Id=i+1;
                }
            
            }
            
            
                
                temp.set(minId,min);
                temp.remove(min2Id);
            count++;
         }

        return count;
    }

    boolean isAscending(List<Integer> list){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                return false;
            }
        }
         return true;
    }
}