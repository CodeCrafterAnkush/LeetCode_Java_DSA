class Solution {
    public static boolean isMatching(char a,char b){
        if((a =='(' && b==')') || (a=='{' && b=='}') || (a =='[' && b==']') ){
            return true;
        }
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();                
         for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch== '(' || ch=='{' || ch=='['){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                else if(isMatching(stack.peek(),ch)){
                    stack.pop();
                }else{
                    return false;
                }
            }
         }

         return stack.isEmpty();
    }
}