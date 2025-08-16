class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int prefixSum = 0;
        int minus=0;
        int plus=0;
        int min =Integer.MAX_VALUE;
        while(plus<nums.length){
            prefixSum += nums[plus];
            plus++;
            while(prefixSum >= target){
                int length = plus-minus;
                min = Math.min(min,length);
                prefixSum -= nums[minus];
                minus++;
            }
        }
        return (min==Integer.MAX_VALUE)?0:min;
    }
}