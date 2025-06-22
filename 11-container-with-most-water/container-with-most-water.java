class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
     int leftPtr = 0;
     int rightPtr = height.length-1;
     while(leftPtr < rightPtr){
            int width = rightPtr-leftPtr;
            int ht = Math.min(height[leftPtr],height[rightPtr]);
            int area = width*ht;
            maxWater = Math.max(maxWater,area);
            if(height[leftPtr] < height[rightPtr]){
                leftPtr++;
            }else{
                rightPtr--;
            }
            
     }
     return maxWater;  
    }
}