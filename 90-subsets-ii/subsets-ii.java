class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        int subSets = 1<<n;
        List<List<Integer>> ansList = new ArrayList<>();
        Set<List<Integer>> setOfList = new HashSet<>();
        for(int num =0;num<subSets;num++){
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                if((num & (1<<i)) != 0){
                    list.add(nums[i]);
                }
            }
            Collections.sort(list);
            setOfList.add(list);
            // ansList.add(list);
        }

        for(List<Integer> li : setOfList){
            ansList.add(li);
        }

        return ansList;
    }
}
