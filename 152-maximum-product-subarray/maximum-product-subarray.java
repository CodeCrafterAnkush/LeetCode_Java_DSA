class Solution {
    public int maxProduct(int[] nums) {
        int prefixPro=1;
        int sufixPro=1;
        int n = nums.length;
        int maxPro=nums[0];

        for(int i=0;i<n;i++){
            if(prefixPro==0){
                prefixPro=1;
            }
            if(sufixPro==0){
                sufixPro=1;
            }

            prefixPro *= nums[i];
            sufixPro *= nums[n-1-i];

            maxPro = Math.max(maxPro , Math.max(prefixPro,sufixPro));
        }

        return maxPro;
    }
}