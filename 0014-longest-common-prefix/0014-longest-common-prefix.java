class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String prefix="";
        int i=0;

        while(i<strs[0].length() && strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
            prefix = prefix+strs[0].charAt(i);
            i++;
        }


        return prefix;
    }
}