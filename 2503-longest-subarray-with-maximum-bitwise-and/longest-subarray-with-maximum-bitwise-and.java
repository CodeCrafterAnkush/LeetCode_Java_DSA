class Solution {
    public int longestSubarray(int[] nums) {
        // Arrays.sort(nums);
        if(nums.length==1)return 1;
        int maxIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[maxIdx])
                maxIdx = i;
        }
        int maxVal = nums[maxIdx];
        int subArrCount =0;
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == maxVal){
                subArrCount++;
                maxLength = Math.max(subArrCount,maxLength);
                // if(i!=nums.length-1){
                //     if(nums[i]==nums[i+1]){
                //         subArrCount++;
                //         maxLength = Math.max(subArrCount,maxLength);
                //     }else{
                //         suArrCount
                //     }
                // }
            }else{
                subArrCount =0;
            }
        }
        // for(int i : nums)System.out.println(i);
        
        // System.out.println(nums[maxIdx]);
        // System.out.println(maxIdx);

        int length = 1;
        // if (maxIdx == nums.length - 1) {
        //     int i = nums.length - 2;
        //     int maxEle = nums[maxIdx];
        //     while (maxEle == nums[i] && i >= 0) {
        //         length++;
        //         if(i==0)break;
        //         i--;
        //     }
        // }

        // if (maxIdx == 0) {
        //     int i = 1;
        //     int maxEle = nums[0];
        //     while (maxEle == nums[i] && i < nums.length) {
        //         length++;
        //         if(i==nums.length-1)break;
        //         i++;
        //     }
        // } else if (maxIdx == nums.length - 1) {
        //     int i = nums.length - 2;
        //     int maxEle = nums[nums.length - 1];
        //     while (maxEle == nums[i] && i >= 0) {
        //         length++;
        //         if(i==0)break;
        //         i--;
        //     }
        // } else if (nums[maxIdx] == nums[maxIdx + 1]) {
        //     int i = maxIdx + 1;
        //     int maxEle = nums[maxIdx];
        //     while (maxEle == nums[i] && i < nums.length) {
        //         length++;
        //         if(i==nums.length-1)break;
        //         i++;
        //     }
        // }else if(nums[maxIdx]==nums[maxIdx-1]){
        //     int i = maxIdx-1;
        //     int maxEle = nums[maxIdx];
        //     while (maxEle == nums[i] && i >= 0) {
        //         length++;
        //         i--;
        //     }
        // }
        return maxLength;
    }
}