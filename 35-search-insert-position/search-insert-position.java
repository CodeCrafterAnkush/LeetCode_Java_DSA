class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0,index=0;
        while(i<=nums.length-1){
            if(nums[i]==target){
                return i;
            }else if(nums[nums.length-1]<target){
                     return nums.length;
                }else if(nums[i]<target) {
                    index++ ;
                }
            
            i++;
        }
        return index;
    }
}