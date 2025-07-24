class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        // Map<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int subArrSum = 0;
        int maxSum = 0;
        int arr[] = new int[100001];
        while(left<nums.length && right<nums.length){
            // if(map.containsKey(nums[right])){
            //     subArrSum -= nums[left];
            //     map.remove(nums[left]);
            //     left++;
            // }else{
            //     map.put(nums[right],right);
            //     subArrSum +=nums[right];
            //     maxSum=Math.max(subArrSum,maxSum);
            //     right++;
            // }
            if(arr[nums[right]]==1){
                while (nums[left] != nums[right]) {
                    arr[nums[left]] = 0;
                    subArrSum -= nums[left];
                    left++;
                }
                arr[nums[left]] = 0;
                subArrSum -= nums[left];
                left++;
            }else{
               arr[nums[right]]=1;
                subArrSum +=nums[right];
                maxSum=Math.max(subArrSum,maxSum);
                right++;
            }
        }

        return maxSum;
    }
}