class Solution {
    public long factorial(int n){
        int mod = 1000000007;
        if(n == 0)return 1;
        long result = 1;
        for(int i=1;i<=n;i++){
            result=(result*i)% mod;
        }

        return result;

    }
    public int countPermutations(int[] complexity) {
        boolean isPossible = true;
        int result =0;
        for(int i=1;i<complexity.length;i++){
            if(complexity[0]>=complexity[i]){
                return 0;
            }
        }

        return (int)factorial(complexity.length-1);

    }
}