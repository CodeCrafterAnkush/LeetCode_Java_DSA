class Solution {
public void findCombination(int idx, int[]arr, int target, List<List<Integer>> ans, List<Integer>list){
    if(idx == arr.length){
        if(target == 0){
            ans.add(new ArrayList<>(list));
        }
        return;
    }
    if(arr[idx]<=target){
        list.add(arr[idx]);
        findCombination(idx,arr,target-arr[idx],ans,list);
        list.remove(list.size()-1);
    }
    findCombination(idx+1,arr,target,ans,list);
}
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}