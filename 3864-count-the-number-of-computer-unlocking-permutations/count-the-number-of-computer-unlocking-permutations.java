class Solution {
    public int countPermutations(int[] complexity) {
        int n=complexity.length;
        for(int i=1;i<n;i++){
            if(complexity[0]>=complexity[i])return 0;
        }

        int mod = 1000000007;
        long result = 1;
        for(int i=1;i<=n-1;i++){
            result=(result*i)% mod;
        }

        return (int)result;

    }
}