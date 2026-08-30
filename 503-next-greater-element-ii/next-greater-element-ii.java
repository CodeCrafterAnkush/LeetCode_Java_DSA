class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int arr [] = new int [nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=2*nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && nums[i%n]>=nums[stack.peek()])stack.pop();

            if(stack.isEmpty()){
                arr[i%n]=-1;
            }else{
                arr[i%n]=nums[stack.peek()];
            }

            // arr[i%n]= stack.isEmpty()?-1:nums[stack.peek()];
            stack.push(i%n);
        }
        return arr;
    }
}