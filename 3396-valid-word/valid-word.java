class Solution {
    public boolean isVowel(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return true;
            }
        }
        return false;
    }

    public boolean containsSymbol(String s) {
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(s.charAt(i) == '@' || s.charAt(i) == '$' || s.charAt(i)=='#'){
                return true;
            }
        }
        return false;

    }

    public boolean containsConsonant(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (Character.isLetter(ch) && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                return true;
            }
        }
        return false;
    }

    public boolean isValid(String word) {
        if(word.length()<3)return false;
        if(!isVowel(word)) return false;
        if(!containsConsonant(word))return false;
        if(containsSymbol(word))return false;
        return true;
    }
}