class Solution {
    public int lowerBound(int arr[],int target,int n){
        int low =0;
        int high = n-1;
        int ans = 0;
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
    public int upperBound(int arr[],int target,int n){
        int low =0;
        int high = n-1;
        int ans = n;
        while(low<= high){
            int mid = low+(high-low)/2;
            if(arr[mid]>target){
                ans=mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int posArr[]= {-1,-1};
        if(nums.length ==0 )return posArr;
        if(nums[0]> target) return posArr;
        if(nums[nums.length-1]<target)return posArr;
        int lb = lowerBound(nums,target,nums.length);
        int ub = upperBound(nums,target,nums.length)-1;
        if(nums.length == 1 && target == nums[nums.length-1]){
            posArr[0]=0;
            posArr[1]=0;
        }else if(lb< nums.length && ub >= 0 && nums[lb]==target && nums[ub]==target){
            posArr[0]=lb;
        posArr[1]=ub;
        }
        
        return posArr;
    }
}