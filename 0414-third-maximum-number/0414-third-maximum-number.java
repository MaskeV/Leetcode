class Solution {
    public int thirdMax(int[] nums) {

        Integer prevMax = null;
        Integer firstMax = null;
        int count = 0;

        for (int i = 0; i < 3; i++) {
            Integer currMax = null;

            for (int j = 0; j < nums.length; j++) {

                // skip numbers already used
                if (prevMax != null && nums[j] >= prevMax)
                    continue;

                if (currMax == null || nums[j] > currMax) {
                    currMax = nums[j];
                }
            }

            if (currMax == null)
                break;

            prevMax = currMax;
            count++;

            if (count == 1)
                firstMax = currMax;
        }

        return count < 3 ? firstMax : prevMax;
    }
}

