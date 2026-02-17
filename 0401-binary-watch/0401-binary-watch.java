class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();

        if(turnedOn>8){
            return ans;
        }
        
        for(int hour=0;hour<12;hour++){
            
            for(int min=0;min<60;min++){

               int totalBits = Integer.bitCount(hour)+Integer.bitCount(min);

               if(totalBits==turnedOn){
                   String time = hour + ":" ;
                   if(min<10){
                    time+="0";
                   }
                    time+=min;
                    ans.add(time);
               }

            }
        }
         return ans; 
        
    }
 
}