class Solution {
    // public void helper( List<List<Integer>> ansList, int idx, List<Integer> temp, int nums[] ){

    //     if(idx == nums.length){
    //         ansList.add(new ArrayList<>(temp));
    //         return;
    //     }

    //     temp.add(nums[idx]);
    //     helper(ansList, idx+1, temp, nums);

    //     temp.remove(temp.size()-1);
    //     helper(ansList, idx+1, temp, nums);

    // }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        
        // helper(ansList , 0, new ArrayList<>(), nums);
        int n= nums.length;
        int subset = 1 << n;
        for(int num = 0;num<subset;num++){
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                if((num & (1<<i))!=0){
                    list.add(nums[i]);
                }
            }
            ansList.add(list);
        }
        return ansList;
        
    }
}