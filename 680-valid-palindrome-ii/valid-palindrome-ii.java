class Solution {
    public boolean helper(String str ){
         int start =0; 
        int end = str.length()-1;
        if(str.length()==1){
            return true;
        }
        while(start < end){
            if(str.charAt(start)!= str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    } 
    public boolean validPalindrome(String s) {
        int start =0; 
        int end = s.length()-1;
         while(start < end){
            if(s.charAt(start)!= s.charAt(end)){
                if(helper(s.substring(start,end))|| helper(s.substring(start+1,end+1))){
                    return true;
                }else{
                    return false;
                }
            }
            start++;
            end--;
        }

        return true;
    }
}