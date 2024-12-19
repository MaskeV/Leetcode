import java.util.*;

class Solution {
    private int merge(int l, int mid, int r, List<Integer> nums) {
        List<Integer> temp = new ArrayList<>();
        int i = l, j = mid + 1, count = 0;

        // Counting reverse pairs
        while (i <= mid && j <= r) {
            if ( (long)nums.get(i) > 2L * nums.get(j)) {
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


// import java.util.*;

// class Solution {
//     private static void merge(int[] arr, int low, int mid, int high) {
//         ArrayList<Integer> temp = new ArrayList<>(); // temporary array
//         int left = low;      // starting index of left half of arr
//         int right = mid + 1;   // starting index of right half of arr

//         //storing elements in the temporary array in a sorted manner//

//         while (left <= mid && right <= high) {
//             if (arr[left] <= arr[right]) {
//                 temp.add(arr[left]);
//                 left++;
//             } else {
//                 temp.add(arr[right]);
//                 right++;
//             }
//         }

//         // if elements on the left half are still left //

//         while (left <= mid) {
//             temp.add(arr[left]);
//             left++;
//         }

//         //  if elements on the right half are still left //
//         while (right <= high) {
//             temp.add(arr[right]);
//             right++;
//         }

//         // transfering all elements from temporary to arr //
//         for (int i = low; i <= high; i++) {
//             arr[i] = temp.get(i - low);
//         }
//     }
//     void countPairs(int[] arr,int low,int mid,int high){
//         int right=mid+1;
//          for(int i=low;i<mid;i++){
//             while(right<=high && arr[i]>2*arr[right]){
//                 right++;
//             }
//          }
//     }

//     public static void mergeSort(int[] arr, int low, int high) {
//         if (low >= high) return;
//         int mid = (low + high) / 2 ;
//         mergeSort(arr, low, mid);  // left half
//         mergeSort(arr, mid + 1, high);// right half
//         countPairs(arr,low,mid,high);
//         merge(arr, low, mid, high);  // merging sorted halves
//     }
//      public int reversePairs(int[] nums) {
//         mergeSort(nums,0,nums.length-1);
//      }
   
// }
