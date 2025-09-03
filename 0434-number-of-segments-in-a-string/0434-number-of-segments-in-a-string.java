class Solution {
    public int countSegments(String s) {
       
        String[] words = s.split(" ");
        int count=0;
        for(String str : words){
            if(str.equals("")){
                continue;
            }else{
                count++;
            }
        }
        return count;
    }
}