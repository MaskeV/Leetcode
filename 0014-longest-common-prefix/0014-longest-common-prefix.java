class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb=new StringBuilder();
        //int i=0;
        //while(i<strs[0].length() && strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
         // sb.append(strs[0].charAt(i));
          //i++;
       // }
       String first=strs[0];
       String last =strs[strs.length-1];
       for(int i=0;i<strs[0].length();i++){
        if(first.charAt(i)==last.charAt(i)){
            sb.append(first.charAt(i));
        }else{
            break;
        }
       }
        return sb.toString();
    }
}