class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
    //  for(int i =0; i< height.length;i++){
    //     for(int j =i+1; j<height.length;j++){
    //         int width = j-i;
    //         int ht = Math.min(height[i],height[j]);
    //         int area = width*ht;
    //         maxWater = Math.max(maxWater,area);
    //     }
    //  } 

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