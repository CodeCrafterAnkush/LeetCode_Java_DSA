class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ansList = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1; j<n; j++){
                int k=j+1;
                int l=n-1;
                if(j!=(i+1) && nums[j]==nums[j-1]) continue;
                while(k<l){
                    long sum = nums[i]+nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if(sum == target){
                        List<Integer> li = new ArrayList<>();
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[k]);
                        li.add(nums[l]);
                        ansList.add(li);
                        k++;
                        l--;
                        while(k<l && nums[k] == nums[k-1]) k++;
                        while(k<l && nums[l] == nums[l+1]) l--;
                    }
                    else if(sum < target) k++;
                    else l--;
                }
            }
        }
        return ansList;
    }
}