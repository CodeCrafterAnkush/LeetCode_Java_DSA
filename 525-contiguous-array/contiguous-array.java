class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)nums[i]=-1;
        }
        int sum =0;
        int maxLen = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(sum,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum)){
                int lastPos = map.get(sum);
                maxLen = Math.max(maxLen,i-lastPos);
            }else{
                map.put(sum,i);
            }
        }

        return maxLen;

    }
}