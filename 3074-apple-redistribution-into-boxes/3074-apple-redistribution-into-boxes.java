class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int appleCount=0;
        int count=0;
        for(int i=0;i<apple.length;i++){
            appleCount+=apple[i];
        }
        int sum=0;
        //Arrays.sort(capacity);
        //for(int i=capacity.length-1;i>0;i--){
         //   sum+=capacity[i];
           // count++;
            //if(sum>=appleCount){
              //  return count;
            //}

         int freq[]=new int[51];
         for(int i=0;i<capacity.length;i++){
            freq[capacity[i]]++;
         }

         for(int i=50;i>0;i--){
            while(freq[i]>0){
               sum+=i;
               count++;
               if(sum>=appleCount){
                return count;
               }
               freq[i]--;
            }
         
        }
        return capacity.length;
    }
}