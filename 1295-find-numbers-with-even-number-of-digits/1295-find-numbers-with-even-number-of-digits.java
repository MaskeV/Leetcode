class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
        //     int digit = 0;
        //     if (i < 0) {
        //         i *= -1;
        //     }
        //     if (i == 0) {
        //         digit = 1;
        //     }

        //     while (i > 0) {
        //         i = i / 10;
        //         digit++;
        //     }

        //shortcut to find no of digits in no;
              int digit = (int) Math.log10(i)+1;

            if (digit % 2 == 0) {
                count++;
            }
        }
          
        return count;

    }
}
// class Solution {
//     public int findNumbers(int[] nums) {
//         int count=0;
//         for(int i:nums){
//             String no =  String.valueOf(i);
//             int digits=no.length();
//             if(digits%2==0){
//                 count++;
//             }
//         }
//         return count;
//     }
// }