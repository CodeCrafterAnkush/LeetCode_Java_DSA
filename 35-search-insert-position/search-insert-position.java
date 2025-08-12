class Solution {
    public int lowerBound(int arr[],int target,int n){
        int low =0;
        int high = n-1;
        int ans = n;
        while(low<= high){
            int mid = low+(high-low)/2;
            if(arr[mid]>=target){
                ans=mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public int searchInsert(int[] nums, int target) {
        // int i=0,index=0;
        // while(i<=nums.length-1){
        //     if(nums[i]==target){
        //         return i;
        //     }else if(nums[nums.length-1]<target){
        //              return nums.length;
        //         }else if(nums[i]<target) {
        //             index++ ;
        //         }
            
        //     i++;
        // }
        // return index;

        //-------OR___________
        return lowerBound(nums,target,nums.length);
    }
}