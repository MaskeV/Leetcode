class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(map.containsKey(ch1)){
                if(map.get(ch1)!=ch2){
                    return false;
                }
            }else if(map.containsValue(ch2)){
                 return false;
            }
          
            map.put(ch1,ch2);
        }
        return true;
    }
}

// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//        int[] indexS = new int[200];
//        int[] indexT=new int[200];
//        if(s.length()!=t.length()){
//         return false;
//        }
//         for(int i=0;i<s.length();i++){
//             if(indexS[s.charAt(i)]!=indexT[t.charAt(i)]){
//                 return false;
//             }
//             indexS[s.charAt(i)]=i+1;
//             indexT[t.charAt(i)]=i+1;
//         }
//         return true;
//        }

        
//     }
