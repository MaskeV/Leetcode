class Solution {
    public String frequencySort(String s) {

        Map<Character,Integer> map = new HashMap<>();
    
        for(int i=0;i<s.length();i++){
           map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        List<Character> list = new ArrayList<>();

        for(char c:map.keySet()){
            list.add(c);
        }

        list.sort((a,b)-> map.get(b).compareTo(map.get(a)));

        String ans = "";

        for(char c:list){
            int n = map.get(c);
            for(int i=0;i<n;i++){
                ans = ans+c;
            }
        }      

        return ans; 
    }
}