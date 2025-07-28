class Solution {
    public int countWays(int[]nums,int idx,int sum,int target){
        if(idx == nums.length){
            if(sum == target) return 1;
            else return 0;
        }
        // if(sum>target)return 0;
        // int positive = Integer.parseInt("+"+nums[idx]);
        // int negative = Integer.parseInt("-"+nums[idx]);
        int positiveWays=countWays(nums,idx+1,sum+nums[idx],target);
        int negativeWays =countWays(nums,idx+1,sum-nums[idx],target);
        return positiveWays+negativeWays;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return countWays(nums,0,0,target);
    }
}