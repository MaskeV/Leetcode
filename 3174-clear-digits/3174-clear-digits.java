// class Solution {
//     public String clearDigits(String s) {
//         StringBuilder res = new StringBuilder();
//         int count=0,j=0;

//         for(int i=0;i<s.length();i++){
//             res.append(s.charAt(i));
//             if((Character.isDigit(s.charAt(i)))){
//                 count++;
        
//             }
//         }
       
//         for(int i=s.length()-1;i>=0;i--){
//             if((Character.isDigit(s.charAt(i)))){
//                 res.deleteCharAt(i);
//             }else if(count>0){
//                 res.deleteCharAt(i);
//                 count--;
//             }
//         }
//         return res.toString();
     

        
//     }
// }


class Solution {
    public String clearDigits(String s) {
        int i=0;

        StringBuilder res=new StringBuilder();
        for(int id=0;id<s.length();id++){
           res.append(s.charAt(id));
        }
        while(i<res.length()){
            if(Character.isDigit(res.charAt(i))){
               res.deleteCharAt(i);
               if(i>0){
               res.deleteCharAt(i-1);
               i--;
               }
            }else{
            i++;
        }}
        return res.toString();
         
    }
}