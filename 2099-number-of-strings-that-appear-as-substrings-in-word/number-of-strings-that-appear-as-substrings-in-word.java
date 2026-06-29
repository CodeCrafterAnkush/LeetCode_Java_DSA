class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String ptt: patterns){
            if(word.contains(ptt)) count++;
        }
        return count;
    }
}