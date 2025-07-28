class Solution {
    public int countOr(int []nums,int idx,int maxOr,int currOr){
        if(idx==nums.length){
            return currOr == maxOr?1:0;
        }

        int peek =countOr(nums,idx+1,maxOr,currOr|nums[idx]);
        int notPeek =countOr(nums,idx+1,maxOr,currOr);

        return peek + notPeek;
    }
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0;
        // for(int i : nums){
        //     maxOr = maxOr|i;
        // }
        for(int i=0;i<nums.length;i++){
            maxOr = maxOr|nums[i];
        }

        return countOr(nums,0,maxOr,0);
    }
}