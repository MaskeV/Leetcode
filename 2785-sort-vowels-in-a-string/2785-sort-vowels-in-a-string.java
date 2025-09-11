class Solution {
    public String sortVowels(String s) {
        List<Character> l = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(c=='A'|| c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                l.add(c);
            }
        }
        Collections.sort(l);
        int id=0;
        StringBuilder ans =new StringBuilder(s);
         for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(c=='A'|| c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
               ans.setCharAt(i,l.get(id));
               id++;
            }
        }

        return ans.toString();
        
    }
}