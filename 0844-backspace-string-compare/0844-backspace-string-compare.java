// class Solution {
//     public boolean backspaceCompare(String s, String t) {
//         Stack<Character> stack1 = new Stack<>();
//         Stack<Character> stack2 = new Stack<>();


//         for(int i =0;i<s.length();i++){
//             if(s.charAt(i)=='#' && !stack1.isEmpty()){
//                 stack1.pop();
//             }else if(s.charAt(i)!='#'){
//             stack1.push(s.charAt(i));
//             }
//         }
//         for(int i =0;i<t.length();i++){
//             if(t.charAt(i)=='#' && !stack2.isEmpty()){
//                 stack2.pop();
//             }else if(t.charAt(i)!='#'){
//             stack2.push(t.charAt(i));
//             }
//         }
//         StringBuilder s1= new StringBuilder();
//         StringBuilder t1= new StringBuilder();

//         while(!stack1.isEmpty()){
//             s1.append(stack1.pop());
//         }
//         while(!stack2.isEmpty()){
//             t1.append(stack2.pop());
//         }
//         return s1.toString().equals(t1.toString());
//     }
// }

class Solution {
  public boolean backspaceCompare(String s, String t) {
    int hashCount1=0;
    int hashCount2=0;
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();

    for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)=='#'){
            hashCount1++;
        }else if(hashCount1==0){
            sb1.append(s.charAt(i));
  
        }else{
            hashCount1--;
        }
    }
    for(int i=t.length()-1;i>=0;i--){
        if(t.charAt(i)=='#'){
            hashCount2++;
        }else if(hashCount2==0){
            sb2.append(t.charAt(i));
  
        }else{
            hashCount2--;
        }
    }
    return sb1.toString().equals(sb2.toString());
  }
}