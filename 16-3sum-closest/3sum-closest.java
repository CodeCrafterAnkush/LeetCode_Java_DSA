class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
       int diff = Integer.MAX_VALUE;
       int ans = 0;
       int sum = 0;
       for(int i=0;i<nums.length;i++){
        int fix = nums[i];
        int start =i+1;
        int end = nums.length-1;
        while(start<end){
            sum = fix+nums[start]+nums[end];
            if(Math.abs(sum-target)<diff){
                diff = Math.abs(sum-target);
                ans=sum;
            }
            // diff = Math.abs(Math.min(sum-target,diff));
            if(sum< target)start++;
            else if(sum >target)end--;
            else return target;
        }
       }
        return ans;
    }
}