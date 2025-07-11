class Solution {
    public int findKthLargest(int[] nums, int k) {
        int KthLargest=0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<nums.length;i++){
            maxHeap.add(nums[i]);
        }

        for(int i=1;i<=k;i++){
            KthLargest=maxHeap.peek();
            maxHeap.poll();
        }

        return KthLargest;

    }
}