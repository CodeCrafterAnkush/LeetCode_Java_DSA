class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch:text.toCharArray()){
            if(ch == 'b'|| ch == 'a' || ch == 'l' || ch == 'o' || ch == 'n'){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        // b,a,n
        int singleCh = Math.min(map.getOrDefault('b',0),Math.min(map.getOrDefault('a',0),map.getOrDefault('n',0)));
        // l,o
        int doubleCh = Math.min(map.getOrDefault('l',0),map.getOrDefault('o',0));

        return Math.min(doubleCh/2,singleCh); 
    }
}