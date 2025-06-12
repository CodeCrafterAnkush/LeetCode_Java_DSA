class Solution {
    public boolean isPalindrome(int x) {
     if(x>=0){
          if(x>=0 && x<10){
            return true;
          }else{
              int original = x;
              String str = String.valueOf(x);
              String rev = "";
              for(int i=str.length()-1;i>=0;i--){
                  rev += str.charAt(i);
                }
                long strNum =Long.valueOf(rev);
                if(original == strNum){
                   return true;
                }else{
                   return false;
                }  
            }  
        }else{
           return false;
        }   
    }
}