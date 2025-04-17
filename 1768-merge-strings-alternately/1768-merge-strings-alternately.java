class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
//         int i=0,j=0,k=0;
//         while(i<word1.length() && j<word2.length()){
//             s.append(word1.charAt(i));
//             s.append(word2.charAt(j));
//             i++;
//             j++;     
//         }
//         while(i<word1.length()){
//             s.append(word1.charAt(i));
//             i++;
//         }
//         while(j<word2.length()){
//             s.append(word2.charAt(j));
//             j++;
//         }
// int m=word1.length(),n=word2.length();


// for(int i=0;i<Math.max(m,n);i++){
//     if(i<m){
//         s.append(word1.charAt(i));
//     }if(i<n){
//         s.append(word2.charAt(i));
//     }

// }
//         return s.toString();
int i=0,j=0,k=0;

while(i<word1.length() || j<word2.length()){
    if(i<word1.length()){
    s.append(word1.charAt(i));
    }
    if(j<word2.length()){
    s.append(word2.charAt(j));
    }
    i++;
    j++;
}
return s.toString();
    }
}












//  class Solution {
//    public String mergeAlternately(String word1, String word2) {
//    int i=0,j=0,k=0;
//    StringBuilder s = new StringBuilder();
//     int n1=word1.length(),n2=word2.length();


//   while(i<n1 || j<n2){
//     if(i<n1){
//     s.append(word1.charAt(i));
//     i++;
//     }
//     if(j<n2){
//     s.append(word2.charAt(j));
//     j++;
//     }
//     }

  
//  return s.toString();

//    }
//  }