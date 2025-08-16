class Solution {
    public int maximum69Number (int num) {
        int max=num;
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        for(int i=0;i<sb.length();i++){
            char currChar = sb.charAt(i);
            if(currChar=='9')sb.setCharAt(i,'6');
            else if(currChar=='6')sb.setCharAt(i,'9');
            max= Math.max(max,Integer.parseInt(sb.toString()));
            sb.setCharAt(i,currChar);
        }

        return max;
    }
}