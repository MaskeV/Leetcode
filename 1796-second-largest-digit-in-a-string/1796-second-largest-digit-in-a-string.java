class Solution {
    public int secondHighest(String s) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
            set.add(s.charAt(i)-'0');
           }
        }
      if(set.size()<=1){
        return -1;
      }
      set.pollLast();
      return set.last();
    }
}