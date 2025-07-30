class Solution {
    public boolean winnerOfGame(String colors) {
        char arr[] = colors.toCharArray();
        int turnA=0;
        int turnB=0;
        for(int i=1;i<colors.length()-1;i++){
            if(arr[i]=='A' && arr[i]==arr[i-1] && arr[i]==arr[i+1])turnA++;
            if(arr[i]=='B' && arr[i]==arr[i-1] && arr[i]==arr[i+1])turnB++;
        }

        return (turnA>turnB)?true:false;
    }
}