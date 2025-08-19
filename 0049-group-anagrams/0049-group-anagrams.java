class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     Map<String,List<String>> map = new HashMap<>();
     for(String word:strs){
        char[] temp = word.toCharArray();
        Arrays.sort(temp);
        String key = new String(temp);

         List<String> groups= map.getOrDefault(key,new ArrayList<>());
         groups.add(word);
         map.put(key,groups);
     }
     return new ArrayList<>(map.values());
    }
}