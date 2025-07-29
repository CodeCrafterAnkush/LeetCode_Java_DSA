class Solution {
    public int findPeakElement(int[] nums) {
        // if(nums.length == 1)return 0;
        // int peakEle =0;
        // for(int i=0;i<nums.length;i++){
        //     if(i==0 && nums[i]>nums[i+1])peakEle = i;
        //     if(i==nums.length-1&&nums[i]>nums[i-1])peakEle =i;
        //     if(i>0 && i<nums.length-1){
        //         if(nums[i]>nums[i-1]&& nums[i]>nums[i+1]) peakEle = i;
        //     }
            
        // }

        if(nums.length == 1)return 0;
        if(nums[0]>nums[1])return 0;
        if(nums[nums.length-1]>nums[nums.length-2])return nums.length-1;
        int start =1;
        int end =nums.length-2;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[mid-1]>nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }

        return -1;
    }
}