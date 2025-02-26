class Solution {
    public int numOfSubarrays(int[] arr) {
        int even =0,odd=0,count=0;
        int curr=0;
         int mod =  (int) Math.pow(10,9)+7;
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            if(curr%2!=0){
                odd++;
                count++;
                count = (count+even)%mod;
                
                
            }else{
                even++;
                count = (count+odd)%mod;            }
            
        }
        
        return count%mod;
    }
}

// class Solution {
//     public int numOfSubarrays(int[] arr) {
//        int count=0;
//        int n = arr.length;
       

//        for(int i=0;i<n;i++){
//         int current = 0;
//         for(int j=i;j<n;j++){
//             current += arr[j];
//             if(current % 2 !=0){
//                 count++;
//             }
//         }
//        }
//        return count ;
//     }
// }

