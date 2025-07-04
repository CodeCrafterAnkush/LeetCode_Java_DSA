class Solution {
    public StringBuilder helper(StringBuilder sb){
        StringBuilder temp = new StringBuilder("");
        int i = 0 ;
         while(i<=sb.length()-1){
            char ch = sb.charAt(i);            
            temp.append((char) (ch + 1));
            i++;
        }
        return temp;
    }
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        while(sb.length()<=k){            
            sb.append(helper(sb));
        }
        return sb.charAt(k-1);
    }
}