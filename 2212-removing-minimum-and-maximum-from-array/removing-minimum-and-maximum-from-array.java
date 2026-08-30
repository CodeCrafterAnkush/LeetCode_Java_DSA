class Solution {
    public int minimumDeletions(int[] nums) {
        int minIdx =0;
        int maxIdx = nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[maxIdx]) maxIdx =i;
            if(nums[i]<nums[minIdx]) minIdx =i;
        }
        int left = Math.min(minIdx,maxIdx);
        int right = Math.max(minIdx,maxIdx);
        int deleteFromFront = right+1;
        int deleteFromBack = nums.length-left;
        int deleteFromBoth = (left+1)+(nums.length-right);

        return Math.min(deleteFromFront,(Math.min(deleteFromBack,deleteFromBoth)));
    }
}