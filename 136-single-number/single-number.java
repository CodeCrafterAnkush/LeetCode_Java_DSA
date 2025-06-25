class Solution {
    public int singleNumber(int[] nums) {
       int unique=nums[0];
            for(int j = 1; j<nums.length;j++){
                 unique = unique ^ nums[j];
            }
        return unique;    
       
    }
}