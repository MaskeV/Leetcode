class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] ch = s.toCharArray();

            Arrays.sort(ch);
            String key = new String(ch);
            if(!map.containsKey(key)){
                List<String> temp = new ArrayList<>();
                temp.add(s);
                map.put(key,temp);
            }else{
                List<String> temp = map.get(key);
                temp.add(s);
                map.put(key,temp);
            }

        }

        List<List<String>> ans = new ArrayList<>();
        for(String key : map.keySet()){
            ans.add(map.get(key));
        }

        return ans;
    }
}