class Solution {
    public int countStep(long n,HashMap<Long,Integer>map){
        if(n==1)return 0;
        if(map.containsKey(n)) return map.get(n);
        int steps;
        if(n%2 ==0){
            steps = 1 + countStep(n/2,map);
        }else{
            steps = 1 + Math.min(countStep(n+1,map),countStep(n-1,map));
        } 
        map.put(n,steps);
        return steps;       
    }
    public int integerReplacement(int n) {
        HashMap<Long,Integer> map = new HashMap<>();
        return countStep((long)n,map);
    }
}