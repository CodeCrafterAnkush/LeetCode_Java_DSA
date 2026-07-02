class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // List<List<Integer>> mainList = new ArrayList<>();
        HashSet<List<Integer>> hsList = new HashSet<>();
        
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         for(int k=j+1;k<nums.length;k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 List<Integer> list = new ArrayList<>();
        //                 list.add(nums[i]);
        //                 list.add(nums[j]);
        //                 list.add(nums[k]);
        //                 Collections.sort(list);
        //                 hsList.add(list);
        //             }
        //         }
        //     }
        // }
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