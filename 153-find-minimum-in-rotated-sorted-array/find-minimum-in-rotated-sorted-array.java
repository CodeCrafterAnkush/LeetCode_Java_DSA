class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int min=0;
        int high = nums.length-1;
        // if(nums.length==1){
        //     return nums[0];
        // }
        // if(nums[low]<nums[high]){
        //     return nums[low];
        // }
        // if(nums[high]<nums[low]&& nums[high]<nums[high-1]){
        //     return nums[high];
        // }
    
        while(low<high){
            int mid=(low+high)/2;
            // if(nums[mid+1]<nums[mid]&&nums[mid+1]<nums[low]){
            //     low=mid+1;
            //     min= nums[mid+1];
            // }else {
            //     high=mid;
            // }
            if(nums[mid]>nums[high]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return nums[low];
    }
}