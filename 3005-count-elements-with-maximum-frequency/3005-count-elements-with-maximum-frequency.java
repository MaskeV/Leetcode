class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int max=0;
        for(int i:nums){
            freq[i]++;
            max=freq[i]>max ? freq[i]:max;
        }
        int sum=0;
        for(int i=0;i<101;i++){
            if(freq[i]==max){
             sum+=freq[i];
            }
        }
return sum;
    }
}



// class Solution {
//     public int maxFrequencyElements(int[] nums) {
//         Map<Integer,Integer> map =new HashMap<>();
//         int max=0;
//         for(int i:nums){
//             map.put(i,map.getOrDefault(i,0)+1);
//             max=map.get(i)>max ? map.get(i):max;
//         }
      
//         int sum=0;
//         for(int i:map.keySet()){
//             if(map.get(i)==max){
//                 sum+=max;
//             }
//         }
//         return sum;
//     }
// }