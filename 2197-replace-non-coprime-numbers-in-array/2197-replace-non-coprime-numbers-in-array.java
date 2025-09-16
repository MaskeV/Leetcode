// class Solution {
//     public List<Integer> replaceNonCoprimes(int[] nums) {
//         for(int i=0;i<nums.length-1;i++){
//             if(gcd(nums[i],nums[i+1])){
//             nums[i]=lcm(nums[i],nums[i+1]);
//             }

//         }
//         return nums;
//     }
//     static int lcm(int n1,int n2){
//         int max = Math.max(n1,n2);
//         int min = math.min(n1,n2);
//         for(int i=max;i<=n1*n2;i+max){
//             if(i%min){
//                 return i;
//             }
//         }
//         return n1*n2;
//     } 
//     static boolean gcd(int a,int b){
//         int min = Math.min(a,b);
//         while(min>1){
//             if(a%min==0 && b%min==0){
//                 return true;
//                 min--;
//             }
//         }
//       return false;
//     }
// }

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> stack = new ArrayList<>();
        
        for (int num : nums) {
            while (!stack.isEmpty()) {
                int top = stack.get(stack.size() - 1);
                int g = gcd(top, num);
                if (g == 1) {
                    break;
                }
                // merge top with current num (via LCM)
                stack.remove(stack.size() - 1);
                num = (top / g) * num;  // safer LCM
            }
            stack.add(num);
        }
        
        return stack;
    }
    
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}