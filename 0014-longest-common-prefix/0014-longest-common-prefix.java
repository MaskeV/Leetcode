class Solution {
    public String longestCommonPrefix(String[] strs) {
    
      //  Arrays.sort(strs);
        //String first=strs[0];
        //String last=strs[strs.length-1];
        //StringBuilder res = new StringBuilder();
        //int i=0;
        //while(i<first.length() && first.charAt(i)==last.charAt(i)){
          //  res.append(first.charAt(i));
           // i++;
        //}
        //return res.toString();
          String prefix = strs[0];

          for(int i=1;i<strs.length;i++){
            int id=0;
            while(id<strs[i].length() && id <prefix.length() && prefix.charAt(id)==strs[i].charAt(id)){
                id++;
            }
            prefix=prefix.substring(0,id);

          }
          return prefix;
    }
}