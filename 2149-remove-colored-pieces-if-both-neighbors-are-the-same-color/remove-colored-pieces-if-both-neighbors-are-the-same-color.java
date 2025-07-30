class Solution {
    public boolean winnerOfGame(String colors) {
        int turnA=0;
        int turnB=0;
        for(int i=1;i<colors.length()-1;i++){
            if(colors.charAt(i)=='A' && colors.charAt(i)==colors.charAt(i-1)&& colors.charAt(i)==colors.charAt(i+1))turnA++;
            if(colors.charAt(i)=='B' && colors.charAt(i)==colors.charAt(i-1)&& colors.charAt(i)==colors.charAt(i+1))turnB++;
        }

        return turnA>turnB;
    }
}