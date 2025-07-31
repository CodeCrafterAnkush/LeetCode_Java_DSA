class Solution {
    public long factorial(int n){
        if(n == 0)return 1;
        long result = 1;
        for(int i=1;i<=n;i++){
            result=(result*i)% (int)(Math.pow(10,9)+7);
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