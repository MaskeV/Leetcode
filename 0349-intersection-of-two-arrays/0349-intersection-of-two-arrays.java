class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] count = new int[1001];
        List<Integer> result = new ArrayList<Integer>();
        for (int t : nums2)
            count[t]++;
        for (int t : nums1) {
            if (count[t] >= 1) {
                result.add(t);
                count[t] = 0;
            }
        }
        return result.stream().mapToInt(i -> i).toArray();

    }
}