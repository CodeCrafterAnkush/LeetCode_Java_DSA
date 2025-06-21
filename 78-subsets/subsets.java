class Solution {
    public void helper( List<List<Integer>> ansList, int idx, List<Integer> temp, int nums[] ){

        if(idx == nums.length){
            ansList.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[idx]);
        helper(ansList, idx+1, temp, nums);

        temp.remove(temp.size()-1);
        helper(ansList, idx+1, temp, nums);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        
        helper(ansList , 0, new ArrayList<>(), nums);
        return ansList;
        
    }
}