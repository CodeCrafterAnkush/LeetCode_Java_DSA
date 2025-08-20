class Solution {
    public List<List<Integer>> ansList = new ArrayList<>();
    public void helper(int k,int n,int sum,int start,List<Integer> list){
        if(list.size() == k){
            if(sum == n){
                ansList.add(new ArrayList<>(list));
            }
            return;
        }
        for(int i=start;i<=9;i++){
            if(sum +i > n)break;
            list.add(i);
            helper(k,n,sum+i,i+1,list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        if(n<k)return ansList;
        helper(k,n,0,1,new ArrayList<>());
        return ansList;
    }
}