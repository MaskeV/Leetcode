// class Solution {
//     public String intToRoman(int n) {
//     Map<Integer, String> map = new HashMap<>();
// map.put(1, "I");
// map.put(4, "IV");
// map.put(5, "V");
// map.put(9, "IX");
// map.put(10, "X");
// map.put(40, "XL");
// map.put(50, "L");
// map.put(90, "XC");
// map.put(100, "C");
// map.put(400, "CD");
// map.put(500, "D");
// map.put(900, "CM");  
// map.put(1000, "M");

//         StringBuilder ans = new StringBuilder();
        
//         while(n>0){
//             if(n>0 && n<4){
//                 ans.append(map.get(1));
//                 n=n-1;
//             }
//             if(n==4){
//                ans.append(map.get(4));
//                 n=n-4;
//             }
//             if(n>4 && n<9){
//                 ans.append(map.get(5));
//                 n=n-5;
//             } if(n==9){
//                ans.append(map.get(9));
//                 n=n-9;
//             }
//             if(n>9 && n<40){
//                 ans.append(map.get(10));
//                 n=n-10;
//             }if(n==40){
//                 ans.append(map.get(40));
//                 n=n-40;
//             }
//             if(n>49 && n<90){
//                 ans.append(map.get(50));
//                 n=n-50;
//             }
//             if(n==90){
//                 ans.append(map.get(90));
//                 n=n-90;
//             }
//               if(n>99 && n<400){
//                 ans.append(map.get(100));
//                 n=n-100;
//             }
//             if(n==400){
//                 ans.append(map.get(400));
//                 n=n-400;
//             }
//               if(n>499 && n<900){
//                 ans.append(map.get(500));
//                 n=n-500;
//             }
//             if(n==900){
//                 ans.append(map.get(900));
//                 n=n-900;
//             }
//             if(n>=1000){
//                 ans.append(map.get(1000));
//                 n=n-1000;
//             }

//         }

//         return ans.toString();
//     }
// }

class Solution {
    public String intToRoman(int n) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        StringBuilder ans = new StringBuilder();

        while (n > 0) {
            if (n >= 1000) {
                ans.append(map.get(1000));
                n -= 1000;
            } else if (n >= 900) {
                ans.append(map.get(900));
                n -= 900;
            } else if (n >= 500) {
                ans.append(map.get(500));
                n -= 500;
            } else if (n >= 400) {
                ans.append(map.get(400));
                n -= 400;
            } else if (n >= 100) {
                ans.append(map.get(100));
                n -= 100;
            } else if (n >= 90) {
                ans.append(map.get(90));
                n -= 90;
            } else if (n >= 50) {
                ans.append(map.get(50));
                n -= 50;
            } else if (n >= 40) {
                ans.append(map.get(40));
                n -= 40;
            } else if (n >= 10) {
                ans.append(map.get(10));
                n -= 10;
            } else if (n >= 9) {
                ans.append(map.get(9));
                n -= 9;
            } else if (n >= 5) {
                ans.append(map.get(5));
                n -= 5;
            } else if (n >= 4) {
                ans.append(map.get(4));
                n -= 4;
            } else {
                ans.append(map.get(1));
                n -= 1;
            }
        }

        return ans.toString();
    }
}
