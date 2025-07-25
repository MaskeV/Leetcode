class Solution {
    public String removeStars(String s) {
        // Stack <Character> stack = new Stack<>();
        // for(char c:s.toCharArray()){
        //     if(c!='*'){
        //         stack.push(c);
        //     }else{
        //         stack.pop();
        //     }
        // }
        // StringBuilder sb = new StringBuilder();
        // for(char c:stack){
        //     sb.append(c);
        // }

        // return sb.toString();
        StringBuilder str = new StringBuilder();
        int idx=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                idx--;
                str.deleteCharAt(idx);
            }else{
                str.append(s.charAt(i));
                idx++;
            }
        }
        return str.toString();
    }
}