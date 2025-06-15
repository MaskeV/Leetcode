class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
   
    int ans=-1;

    //brute force(o(n^2))

    // for(int left=0;left<s.length();left++ ){
    //     for(int right=left+1;right<s.length();right++){
    //         if(s.charAt(left)==s.charAt(right)){
    //             ans=Math.max(ans,right-left-1);
    //         }

    //     }
    
    // }
   

   //Linear (o(n))

   Map<Character,Integer> map = new HashMap<>();
   for(int i=0;i<s.length();i++){
    if(map.containsKey(s.charAt(i))){
        ans=Math.max(ans,i-map.get(s.charAt(i))-1);
    }
    map.put(s.charAt(i),i);

   }

    return ans;


    }
}