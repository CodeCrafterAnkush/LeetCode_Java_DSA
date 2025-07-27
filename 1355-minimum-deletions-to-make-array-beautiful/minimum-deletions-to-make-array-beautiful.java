class Solution {
    public int minDeletion(int[] nums) {
      int minDeletions =0;
      for(int i=0;i<nums.length-1;i++){
        if((i-minDeletions) % 2 == 0){
            if(nums[i]==nums[i+1]){
                minDeletions++;
            }
        }
      }
     
      return (nums.length-minDeletions) % 2 != 0?++minDeletions:minDeletions;  
    }
}