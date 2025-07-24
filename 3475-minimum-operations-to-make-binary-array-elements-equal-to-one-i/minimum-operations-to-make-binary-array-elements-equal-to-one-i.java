class Solution {
    public int minOperations(int[] nums) {
        int count=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0 && i<=(nums.length-3)){
            nums[i] ^= 1;
            nums[i+1] ^= 1;
            nums[i+2] ^= 1;
            count++;
        }else if(nums[i]==0){
            return -1;
        }
       }
       return count;
    }
}