class Solution {
    public void reverseArray(int[] nums,int start, int end){        
        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return;
    }
    public void rotate(int[] nums, int k) {         
        int length = nums.length;
        k = k % length;
        reverseArray(nums,0, length-1);
        reverseArray(nums,0, k-1);
        reverseArray(nums,k, length-1);
        return;
    }
}