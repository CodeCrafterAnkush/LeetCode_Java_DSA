class Solution {
    public boolean isEven(int num){
        if(num%2==0) return true;
        return false;
    }
    public int maximumLength(int[] nums) {
        int oddCount =0;
        int evenCount =0;
        int altCount =1;

        // for Even Counts or Odd Counts
         for(int i = 0;i<nums.length;i++){
            if(nums[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
         }

         int prevEle = nums[0]%2;
         for(int i=1;i<nums.length;i++){
            int currEle = nums[i]%2;
            if(currEle != prevEle){
                altCount++;
                prevEle = currEle;
            }
         }
         return Math.max(altCount,Math.max(oddCount,evenCount));
    }
}