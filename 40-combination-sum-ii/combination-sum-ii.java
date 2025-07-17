class Solution {
    public void findCombination(int idx, int []arr, int target, List<List<Integer>> ans, List<Integer> combo){
        if(target == 0){
            ans.add(new ArrayList<>(combo));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;

            combo.add(arr[i]);
            findCombination(i+1,arr,target-arr[i],ans,combo);
            combo.remove(combo.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}