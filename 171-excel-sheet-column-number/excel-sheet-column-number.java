class Solution {
        public int getCharValue(char character){
 int value = 0;

        switch (character) {
            case 'A': value = 1; break;
            case 'B': value = 2; break;
            case 'C': value = 3; break;
            case 'D': value = 4; break;
            case 'E': value = 5; break;
            case 'F': value = 6; break;
            case 'G': value = 7; break;
            case 'H': value = 8; break;
            case 'I': value = 9; break;
            case 'J': value = 10; break;
            case 'K': value = 11; break;
            case 'L': value = 12; break;
            case 'M': value = 13; break;
            case 'N': value = 14; break;
            case 'O': value = 15; break;
            case 'P': value = 16; break;
            case 'Q': value = 17; break;
            case 'R': value = 18; break;
            case 'S': value = 19; break;
            case 'T': value = 20; break;
            case 'U': value = 21; break;
            case 'V': value = 22; break;
            case 'W': value = 23; break;
            case 'X': value = 24; break;
            case 'Y': value = 25; break;
            case 'Z': value = 26; break;
        }
        return value;
    }
    public int titleToNumber(String columnTitle) {
        int colNum=0;
        for(int i=0;i<columnTitle.length();i++){
            colNum = colNum*26+getCharValue(columnTitle.charAt(i));
        }

        return colNum;
    }
}