class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();


        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='#' && !stack1.isEmpty()){
                stack1.pop();
            }else if(s.charAt(i)!='#'){
            stack1.push(s.charAt(i));
            }
        }
        for(int i =0;i<t.length();i++){
            if(t.charAt(i)=='#' && !stack2.isEmpty()){
                stack2.pop();
            }else if(t.charAt(i)!='#'){
            stack2.push(t.charAt(i));
            }
        }
        StringBuilder s1= new StringBuilder();
        StringBuilder t1= new StringBuilder();

        while(!stack1.isEmpty()){
            s1.append(stack1.pop());
        }
        while(!stack2.isEmpty()){
            t1.append(stack2.pop());
        }
        return s1.toString().equals(t1.toString());
    }
}