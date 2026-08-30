class Solution {
    public int minimumDeletions(int[] nums) {
        int minIdx =0;
        int maxIdx = nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[maxIdx]) maxIdx =i;
            if(nums[i]<nums[minIdx]) minIdx =i;
        }

        int deleteFromFront = Math.max(minIdx,maxIdx)+1;
        int deleteFromBack = nums.length-Math.min(minIdx,maxIdx);
        int deleteFromBoth = (Math.min(maxIdx,minIdx)+1)+(nums.length-Math.max(minIdx,maxIdx));

        return Math.min(deleteFromFront,(Math.min(deleteFromBack,deleteFromBoth)));
    }
}