class Solution {
    public void combo(int num,int k,int n,List<Integer> li,Set<List<Integer>> set){
        if(k==0){
            Collections.sort(li);
            set.add(new ArrayList<>(li));
            return;
        }
        for(int i=num;i<=n;i++){
            li.add(i);
            combo(i+1,k-1,n,li,set);
            li.remove(li.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for(int i=1;i<=n;i++){
            List<Integer> li = new ArrayList<>();
            li.add(i);
            combo(i+1,k-1,n,li,set);
            li.remove(li.size()-1);
        }

        for(List<Integer> li : set){
            result.add(new ArrayList<>(li));
        }
        return result;
    }
}