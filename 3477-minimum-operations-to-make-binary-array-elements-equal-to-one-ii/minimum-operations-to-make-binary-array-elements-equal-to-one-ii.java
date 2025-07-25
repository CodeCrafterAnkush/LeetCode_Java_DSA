class Solution {
    public int minOperations(int[] nums) {
        int ele =0,count=0;
        for(int i : nums){
            if(ele == i){
                count++;
                ele = (ele^1);
            }
        }
        return count;
    }
}