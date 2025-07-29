class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1)return 0;
        int peakEle =0;
        for(int i=0;i<nums.length;i++){
            if(i==0 && nums[i]>nums[i+1])peakEle = i;
            if(i==nums.length-1&&nums[i]>nums[i-1])peakEle =i;
            if(i>0 && i<nums.length-1){
                if(nums[i]>nums[i-1]&& nums[i]>nums[i+1]) peakEle = i;
            }
            
        }

        return peakEle;
    }
}