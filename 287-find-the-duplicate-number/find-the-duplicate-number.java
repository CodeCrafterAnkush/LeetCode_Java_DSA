class Solution {
    public int findDuplicate(int[] nums) {
        int duplicateNum = nums[0];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //     if((nums[i]^nums[j]) == 0){
        //         duplicateNum = nums[i];
        //         break;
        //     }
        // }
        // }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                duplicateNum = nums[i];
                break;
            }else{
                map.put(nums[i],1);
            }
        }
        return duplicateNum;
    }
}