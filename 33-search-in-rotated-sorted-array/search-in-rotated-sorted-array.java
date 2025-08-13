class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            if(target == nums[low])
            {
                return low;
            }
             if(target == nums[high])
            {
                return high;
            }
            int mid = (low+high)/2;
            if(target == nums[mid])
            {
                return mid;
            }
             //check if left part is sorted else right is sorted
            if(nums[low] <= nums[mid]){
                //if target is present in left part
                if(nums[low]<=target && target <=nums[mid]){
                    high = mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                //if target is present in right part
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }

        return -1;
    }
}