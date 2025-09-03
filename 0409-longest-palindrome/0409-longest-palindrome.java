class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count =0;
        boolean flag = true;

        for(char c:map.keySet()){
         
            if(map.get(c)%2==0){
                count+=map.get(c);
            }if(map.get(c)%2!=0){
                count+=map.get(c)-1;
                flag=false;
            }
        }if(count<s.length()){
        count++;
        }
        return count;
    }
}