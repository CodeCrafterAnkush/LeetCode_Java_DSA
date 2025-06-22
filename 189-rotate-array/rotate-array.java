class Solution {
    public void reverseArray(int[] nums,int start, int end){
        
        while(start<=end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return;
    }
    public void rotate(int[] nums, int k) {
        // if(nums.length == 1 || nums.length < k) return;
        // int length = nums.length;
        // reverseArray(nums,(length-k), length-1);
        // reverseArray(nums,0,(length-k)-1);
        // reverseArray(nums,0, nums.length-1);
        // return;
         
        int length = nums.length;
        int placeMove = k % length;
        System.out.println(placeMove);
        reverseArray(nums,0, length-1);
        reverseArray(nums,0, placeMove-1);
        reverseArray(nums,placeMove, length-1);
        return;
    }
}