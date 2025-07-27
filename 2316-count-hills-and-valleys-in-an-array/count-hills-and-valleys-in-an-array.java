class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        // int curr = 1;
        for (int curr=1;curr < nums.length - 1;curr++) {
            if(nums[curr]==nums[curr-1])continue;
            int left = curr - 1;
            int right = curr + 1;
            // while (left >= 0 && nums[curr] == nums[left])
            //     left--;
            while (right < nums.length && nums[curr] == nums[right])
                right++;
            if (left >= 0 && right < nums.length) {
                if ((nums[curr] > nums[left] && nums[curr] > nums[right]) ||
                        (nums[curr] < nums[left] && nums[curr] < nums[right])) {
                    count++;
                }
            }

        }
        return count;
    }
}