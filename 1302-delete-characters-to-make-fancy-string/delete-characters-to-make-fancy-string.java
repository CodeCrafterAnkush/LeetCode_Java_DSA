class Solution {
    public String makeFancyString(String s) {
       StringBuilder str = new StringBuilder("");
       char prevChar = s.charAt(0);
       str.append(prevChar);
       int count =1;
       for(int i=1;i<s.length();i++){
        char currChar = s.charAt(i);
        if(prevChar == currChar){
            count++;
        }else{
            count=1;
        }
        if(count <3){
             str.append(currChar);
        }
        prevChar=currChar;
       } 

       return str.toString();
    }
}