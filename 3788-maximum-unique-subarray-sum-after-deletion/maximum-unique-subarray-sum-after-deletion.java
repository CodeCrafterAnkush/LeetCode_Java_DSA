class Solution {
    public boolean isNegativeArray(int[] nums) {
        for (int n : nums) {
            if (n > 0)
                return false;
        }
        return true;
    }

    public int maxSum(int[] nums) {
        if (nums.length == 1)return nums[0];

        int maxSum = 0;
        if (isNegativeArray(nums)) {
            int maxVal =Integer.MIN_VALUE;
            for(int n : nums){
                if(n>maxVal)maxVal = n;
            }
            maxSum = maxVal;
        } else {
            HashSet<Integer> seen = new HashSet<>();
            for (int n : nums) {
                if (!seen.contains(n) && n > 0) {
                    maxSum += n;
                    seen.add(n);
                }
            }

        }

        return maxSum;
    }
}