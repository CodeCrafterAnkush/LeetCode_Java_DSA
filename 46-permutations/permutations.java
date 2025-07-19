class Solution {
    public void helper(int nums[], List<List<Integer>> ans,boolean freq[], List<Integer> li ){
        if(li.size() == nums.length){
            ans.add(new ArrayList<>(li));
            return;

        }
        for(int i=0; i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                li.add(nums[i]);
                helper(nums,ans,freq,li);
                li.remove(li.size()-1);
                freq[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        helper(nums,ansList,freq, li);
        return ansList;
    }
}