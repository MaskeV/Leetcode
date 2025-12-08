class Solution {
    public int secondHighest(String s) {
        //TreeSet<Integer> set=new TreeSet<>();
        //for(int i=0;i<s.length();i++){
          // if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
            //set.add(s.charAt(i)-'0');
           //}
        //}
      //if(set.size()<=1){
        //return -1;
     // }
      //set.pollLast();
      //return set.last();


      int last=-1;
      int secLast=-1;

      for(char c:s.toCharArray()){
        if(c>='0' && c<='9'){
            int d=c-'0';
          if(d>last){
            secLast=last;
            last=d;
          }else if(d<last && d>secLast){
            secLast=d;
          }
        }
      }
      return secLast;
    }
}