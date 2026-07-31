class Solution {
    public int minimumPushes(String word) {

        int count=0;
       
        Map<Character,Integer> freq = new HashMap<>();
        Map<Character,Integer> map = new HashMap<>();
        
        
        
        for(int i=0;i<word.length();i++){
           char c = word.charAt(i);
           freq.put(c,freq.getOrDefault(c,0)+1);
        }

      List<Character> temp = new ArrayList<>();

      for(char c : freq.keySet()){
        temp.add(c);
      }

        temp.sort((a,b) -> freq.get(b)-freq.get(a));

       
        
        
        for(int i=0;i<temp.size();i++){
            char c = temp.get(i);
                map.put(c,i/8+1);
        }

        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            count += map.get(c);
        }

        return count;
        
    }
}