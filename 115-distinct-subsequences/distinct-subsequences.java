class Solution {
    public int helper(String s, String t,int i,int j,int[][]dp){
        if(j == t.length()) return 1;
        if(i == s.length()) return 0;
        if(dp[i][j]!= -1)return dp[i][j];

        if(s.charAt(i)==t.charAt(j)){
            int take = helper(s,t,i+1,j+1,dp);
            int notTake = helper(s,t,i+1,j,dp);
            return dp[i][j]=take+notTake;
        }
        // if Not match the element
            int notTake = helper(s,t,i+1,j,dp);
            return dp[i][j]= notTake;
    }
    public int numDistinct(String s, String t) {
        int [][]dp = new int [s.length()][t.length()];
        for(int [] row :dp){
            java.util.Arrays.fill(row,-1);
        }
        return helper(s,t,0,0,dp);
    }
}