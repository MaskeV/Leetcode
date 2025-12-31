class Solution {
    public int firstUniqChar(String s) {


      //  int[] a=new int[26];
        //for(int i=0;i<s.length();i++){
          //  a[s.charAt(i)-'a']++;
        //}
        //for(int i=0;i<s.length();i++){
          //  if(a[s.charAt(i)-'a']==1){
            //    return i;
            //}
        //}
        //return -1;


   // Map<Character,Integer> map=new HashMap<>();
    //for(char c:s.toCharArray()){
    // map.put(c,map.getOrDefault(c,0)+1);
    //}
     //for(int i=0;i<s.length();i++){
       // if(map.get(s.charAt(i))==1){
         //   return i;
        //}
     //}
    //return -1;

    int [] arr=new int[26];
    for(char c:s.toCharArray()){
        arr[c-'a']++;
    }

     for(int i=0;i<s.length();i++){
        if(arr[s.charAt(i)-'a']==1){
            return i;
        }
    }
    return -1;
    }
}