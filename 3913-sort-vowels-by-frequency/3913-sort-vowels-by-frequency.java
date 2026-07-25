class Solution {
    public String sortVowels(String s) {
        
        Map<Character,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
               map.put(c,map.getOrDefault(c,0)+1);
            }
        }

        List<Character> temp = new ArrayList<>();

        for(char c:map.keySet()){
            temp.add(c);
        }

        temp.sort((a,b)->map.get(b).compareTo(map.get(a)));

        String vowels = "";

        for(char c:temp){
            for(int i=0;i<map.get(c);i++){
              vowels+=c;
            }
        }

        int j=0;
        String ans ="";

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                ans+=vowels.charAt(j);
                j++;
            }else{
                ans+=c;
            }

        }

        return ans;
    }
}