class Solution {
    public boolean isAnagram(String s, String t) {
        char []arr1 = s.toCharArray();
        Arrays.sort(arr1);
        char []arr2 = t.toCharArray();
        Arrays.sort(arr2);
        int count=0;
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(arr1[i]==arr2[i]){
                continue;
            }
            else{
                count++;
            }
        }
        if(count==0){
            return true;
        }else{
            return false;
        }
    }
}
        
    
