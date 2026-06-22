class Solution {
    public int maxNumberOfBalloons(String text) {
        int countB =0 ;
        int countA =0;
        int countL = 0;
        int countO = 0;
        int countN = 0;

        for(char ch:text.toCharArray()){
            if(ch == 'b') countB++;
            else if(ch=='a') countA++;
            else if(ch =='l') countL++;
            else if(ch == 'o') countO++;
            else if(ch == 'n')countN++;
        }
        // b,a,n
        int singleCh = Math.min(countB,Math.min(countA,countN));
        // l,o
        int doubleCh = Math.min(countO,countL);

        return Math.min(doubleCh/2,singleCh); 
    }
}