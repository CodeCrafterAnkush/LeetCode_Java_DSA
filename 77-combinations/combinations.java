class Solution {
    public void combo(int num,int k,int n,List<Integer> li,List<List<Integer>> result){
        if(k==0){
            result.add(new ArrayList<>(li));
            return;
        }
        for(int i=num;i<=n;i++){
            li.add(i);
            combo(i+1,k-1,n,li,result);
            li.remove(li.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
            combo(1,k,n,new ArrayList<>(),result);
        return result;
    }
}