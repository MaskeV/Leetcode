class Solution {
    public int minOperations(int[] nums, int k) {
        
        PriorityQueue<Integer> p = new PriorityQueue<>();
        int count =0;
        for(int i:nums){
            if(i<k){
                p.add(i);
            }
        }
        while(!p.isEmpty()){
            int first=p.poll();
            count++;
            if(p.isEmpty())
            break;
            long  temp=first*2L + p.poll();
            
        
            if(temp<k){
                p.add((int) temp);
            }
             
            
        }
     return count;
    }
}
