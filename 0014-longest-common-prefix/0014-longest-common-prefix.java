class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<strs[0].length() && strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
          sb.append(strs[0].charAt(i));
          i++;
        }
        return sb.toString();
    }
}