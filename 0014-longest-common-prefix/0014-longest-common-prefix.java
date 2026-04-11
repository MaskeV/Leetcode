class Solution {
    public String longestCommonPrefix(String[] strs) {
        //Arrays.sort(strs);

        //String prefix="";
        //int i=0;

        //while(i<strs[0].length() && strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
          //  prefix = prefix+strs[0].charAt(i);
            //i++;
        //}


        //return prefix;

        String prefix=strs[0];

        for(int i=1;i<strs.length;i++){
            int id = 0;
            while(id<prefix.length() && id<strs[i].length() && strs[i].charAt(id)== prefix.charAt(id)){
                id++;
            }

            prefix = prefix.substring(0,id);

        }

        return prefix;
    }
}