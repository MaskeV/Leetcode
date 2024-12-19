// class Solution {
//     public int reversePairs(int[] nums) {
//         int count=0;
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=i+1;j<nums.length;j++){
//             if(nums[i]>(2*nums[j])){
//                 count++;
                
//             }
//             }
//         }
//         return count;
//     }
// }

// class Solution {
//     private int merge(int l, int mid, int r, int[] nums) {
//         int[] temp = new int[r - l + 1];
//         int i = l, j = mid + 1, k = 0, count = 0;

//         // Counting reverse pairs
//         while (i <= mid && j <= r) {
//             if ((long) nums[i] > 2L * nums[j]) {
//                 count += mid - i + 1;
//                 j++;
//             } else {
//                 i++;
//             }
//         }

//         i = l;
//         j = mid + 1;

//         // Merging the sorted subarrays
//         while (i <= mid && j <= r) {
//             if (nums[i] <= nums[j]) {
//                 temp[k++] = nums[i++];
//             } else {
//                 temp[k++] = nums[j++];
//             }
//         }

//         while (i <= mid) temp[k++] = nums[i++];
//         while (j <= r) temp[k++] = nums[j++];

//         System.arraycopy(temp, 0, nums, l, temp.length);
//         return count;
//     }

//     private int mergeSort(int l, int r, int[] nums) {
//         if (l >= r) return 0;

//         int count = 0;
//         int mid = l + (r - l) / 2;

//         count += mergeSort(l, mid, nums);
//         count += mergeSort(mid + 1, r, nums);
//         count += merge(l, mid, r, nums);

//         return count;
//     }

//     public int reversePairs(int[] nums) {
//         return mergeSort(0, nums.length - 1, nums);
//     }
// }


import java.util.*;

class Solution {
    private int merge(int l, int mid, int r, List<Integer> nums) {
        List<Integer> temp = new ArrayList<>();
        int i = l, j = mid + 1, count = 0;

        // Counting reverse pairs
        while (i <= mid && j <= r) {
            if ((long) nums.get(i) > 2L * nums.get(j)) {
                count += mid - i + 1;
                j++;
            } else {
                i++;
            }
        }

        i = l;
        j = mid + 1;

        // Merging the sorted subarrays
        while (i <= mid && j <= r) {
            if (nums.get(i) <= nums.get(j)) {
                temp.add(nums.get(i++));
            } else {
                temp.add(nums.get(j++));
            }
        }
        
        while (i <= mid) temp.add(nums.get(i++));
        while (j <= r) temp.add(nums.get(j++));

        for (int k = l; k <= r; k++) {
            nums.set(k, temp.get(k - l));
        }

        return count;
    }

    private int mergeSort(int l, int r, List<Integer> nums) {
        if (l >= r) return 0;

        int count = 0;
        int mid = l + (r - l) / 2;

        count += mergeSort(l, mid, nums);
        count += mergeSort(mid + 1, r, nums);
        count += merge(l, mid, r, nums);

        return count;
    }

    public int reversePairs(int[] nums) {
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) numList.add(num);
        return mergeSort(0, nums.length - 1, numList);
    }
}
