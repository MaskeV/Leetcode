class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
      
        for(String s: strs){
         char[] temp = s.toCharArray();
         Arrays.sort(temp);
         String t = new String(temp);

         if(map.containsKey(t)){
            List<String> list = map.get(t);
             list.add(s);
            map.put(t,list);
         }else{
            List<String> list = new ArrayList<>();
             list.add(s);
            map.put(t,list);
         }
           
      }

      List<List<String>> ans = new ArrayList<>();

      for(String s:map.keySet()){
        ans.add(map.get(s));
      }


      return ans;
  
    }
}