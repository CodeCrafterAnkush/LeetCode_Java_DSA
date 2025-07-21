class Solution {
    public int possibleStringCount(String word) {
        int count =1;
        char prev = word.charAt(0);
        for(int i=1; i<word.length();i++){
            char curr = word.charAt(i);
            if(curr==prev){
                count++;
            }
            prev = curr;
        }
        
        return count;
    }
}