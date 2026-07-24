class Solution {
    public String frequencySort(String s) {

      Map<Character, Integer> map = new HashMap<>();
      
      for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        map.put(c,map.getOrDefault(c,0)+1);
      }

      List<Character> temp = new ArrayList<>();

      for(char c:map.keySet()){
        temp.add(c);
      }

      temp.sort((a,b) ->  map.get(b).compareTo(map.get(a)));

      String ans ="";

      for(char c:temp){
        for(int i=0;i<map.get(c);i++){
            ans += c;
        }
      }
 
      return ans;

    }
}