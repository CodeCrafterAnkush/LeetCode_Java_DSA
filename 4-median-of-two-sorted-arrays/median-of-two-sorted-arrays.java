class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []nums3 = new int [nums1.length+nums2.length];
    int i;
    for(i=0;i<nums1.length;i++){
        nums3[i]=nums1[i];
    }
    for(int j=0;j<nums2.length;j++){
        nums3[i]=nums2[j];
        i++;
    }
    Arrays.sort(nums3);
    int medianIdx=nums3.length/2;
    if(nums3.length % 2==0){
        double medianValue = nums3[nums3.length/2]+nums3[(nums3.length/2)-1];
        return medianValue/2;
    }else{
       
       return nums3[medianIdx];       
    }
    }
}