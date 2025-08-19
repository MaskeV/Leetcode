class Solution {
    public String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray();
       int idx = word.indexOf(ch);
       int left=0;
       int right=idx;
       while(left<right){
        char temp = chars[left];
        chars[left]=chars[right];
        chars[right]=temp;
        left++;
        right--;
       }
       return new String(chars);
    }

}


// class Solution {
//     public String reversePrefix(String word, char ch) {
//         if(!word.contains(ch+"")){
//             return word;
//         }
//         int next=word.length()-1;
//         StringBuilder sb = new StringBuilder();
//         int count=0;
//         for(int i=0;i<word.length();i++){

//             if(word.charAt(i)==ch && count<1){
//                 int id=i;
//                 next=i+1;
//                 while(id>=0){
//                     sb.append(word.charAt(id));
//                     id--;
//                     count++;
//                 }
//             }
//         }
        

//         return sb.toString()+word.substring(next,word.length());
        
//     }
// }