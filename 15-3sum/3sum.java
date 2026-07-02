class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> hsList = new HashSet<>();
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int start = i+1;
            int end = nums.length-1;
            while(start<end){
                int sum = nums[i]+nums[start]+nums[end];
                if(sum == 0){
                    List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[start++]);
                        list.add(nums[end--]);
                        Collections.sort(list);
                        hsList.add(list);
                }else if(sum > 0)end--;
                else if(sum < 0) start++;
            }
        }
        return new ArrayList<>(hsList);
    }
}