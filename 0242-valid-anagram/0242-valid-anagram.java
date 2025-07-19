class Solution {
    public boolean isAnagram(String s, String t) {
        // char [] arr1 = s.toCharArray();
        // Arrays.sort(arr1);
        // char [] arr2 = t.toCharArray();
        // Arrays.sort(arr2);
        // if(arr1.length!=arr2.length){
        //     return false;
        // }
    
        // for(int i=0;i<arr1.length;i++){
            
        //         if(arr1[i]!=arr2[i]){
        //             return false;
        //         }
            
        // }
        // return true;

        int [] alphabate = new int[26];
        for(int i=0;i<s.length();i++){
            alphabate[s.charAt(i)-'a']++; 
        }
        for(int i=0;i<t.length();i++){
            alphabate[t.charAt(i)-'a']--;
        }
        for(int i:alphabate){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
        
    
