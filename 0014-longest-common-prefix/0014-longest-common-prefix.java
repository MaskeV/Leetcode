class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb=new StringBuilder();
        //int i=0;
        //while(i<strs[0].length() && strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
         // sb.append(strs[0].charAt(i));
          //i++;
       // }
       //String first=strs[0];
       //String last =strs[strs.length-1];
       //for(int i=0;i<strs[0].length();i++){
        //if(first.charAt(i)==last.charAt(i)){
          //  sb.append(first.charAt(i));
        //}else{
          //  break;
        //}
      // }
     //   return sb.toString();
     String prefix= strs[0];
     int preflen = strs[0].length();

     for(int i=1;i<strs.length;i++){
        if(strs.length==0 || strs[0].length()==0){
            return "";
        }
        String s= strs[i];
       while(preflen>s.length() || !prefix.equals(s.substring(0,preflen))){
        preflen--;
        prefix=prefix.substring(0,preflen);
        if(preflen==0){
            return "";
        }
       }
      
     } 

     return prefix;
    }
}