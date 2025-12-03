class Solution {
    public void reverseString(char[] s) {
        // char[] rev= new char[s.length];
        // int j=0;
        // for(int i=s.length-1;i>=0;i--){
        //     rev[j] = s[i];
        //     j++;
        // }
        // for(int i=0;i<rev.length;i++){
        //     s[i]=rev[i];
        // System.out.print(rev[i]);
       int left=0,right=s.length()-1;
       while(left<right){
        int temp=s.charAt(left);
        s.charAt(left)=s.charAt(right);
        s.charAt(right)=temp;
       }
       return s;
        
    }
}