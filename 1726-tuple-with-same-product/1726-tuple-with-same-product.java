

import java.util.*;

class Solution {
    public int tupleSameProduct(int[] nums) {
        // Map<Integer, Integer> productCount = new HashMap<>();
        // int count = 0;

        // // Iterate through all pairs (i, j) and store their product in the map
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         int product = nums[i] * nums[j];
                
        //         // If the product already exists, add its count to result
        //         count += productCount.getOrDefault(product, 0);
                
        //         // Increase the product count
        //         productCount.put(product, productCount.getOrDefault(product, 0) + 1);
        //     }
        // }
        
        // return count * 8;  // Each tuple can be arranged in 8 ways


        Map <Integer,Integer> productcount = new HashMap<>();

        int count =0;

        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int product = nums[i]*nums[j];

                count= count + productcount.getOrDefault(product,0);

                productcount.put(product,productcount.getOrDefault(product,0)+1);




            }
        }
        return count*8;
    }
}
