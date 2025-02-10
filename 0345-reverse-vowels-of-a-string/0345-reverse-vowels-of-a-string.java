class Solution {
    public String reverseVowels(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(int i =s.length()-1;i>=0;i--){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'||s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
            res.append(s.charAt(i));
            }
        }
        int j=0;
        for(int i=0;i<s.length();i++){
            if(!(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'||s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')){
           temp.append(s.charAt(i));
            }
            else if(res.length()==0){
                return s;
            }
            else{
                temp.append(res.charAt(j));
                j++;
            }

        }
        return temp.toString();
    }
}