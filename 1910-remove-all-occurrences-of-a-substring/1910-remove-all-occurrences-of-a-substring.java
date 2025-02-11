class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder ans = new StringBuilder(); 
        while(s.contains(part)){
         int partsIndex = s.indexOf(part);

         s = s.substring(0,partsIndex) + s.substring(partsIndex+part.length());

        }
        return s;
        
    }
}