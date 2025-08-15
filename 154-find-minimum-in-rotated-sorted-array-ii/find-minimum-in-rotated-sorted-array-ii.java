class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1)return nums[0];
        int min = Integer.MAX_VALUE;
        int low =0;
        int high =nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[low]== nums[mid]&& nums[mid]==nums[high]){
                min = Math.min(min,nums[mid]);
                low++;
                high--;
                continue;
            }
            if(nums[mid]>nums[high] && nums[low]>=nums[high]){
                min=Math.min(min,nums[high]);
                low = mid+1;
            }else{
                min=Math.min(min,nums[mid]);
                high = mid-1;
            }
        }

        return min;
    }
}