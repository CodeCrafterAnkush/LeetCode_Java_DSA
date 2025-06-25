class Solution {
    public boolean isPalindrome(String s) {
        // String str = "";
        // String revStr = "";
        // for(int i=0; i<s.length(); i++){
        //     if(Character.isLetterOrDigit(s.charAt(i))){
        //         str = str + s.charAt(i);
        //     }
        // }

        // for(int i=str.length()-1; i>=0; i--){
        //     revStr = revStr + str.charAt(i);
        // }

        // if(str.toLowerCase().equals(revStr.toLowerCase()) ){
        //     return true;
        // }
        // return false;

        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int left = 0;
        int right = s.length()-1;
        while(left<= right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}