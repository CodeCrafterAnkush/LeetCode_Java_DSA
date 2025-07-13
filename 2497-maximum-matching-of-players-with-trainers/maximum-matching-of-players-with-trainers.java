class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int count =0;
        // int i=0;
        // for(int i=0; i<players.length;i++){
        //     for(int j=0;j<trainers.length;j++){
        //         if(players[i]<=trainers[j]){
        //             count++;
        //             i++;
        //         }
        //     }
        // }
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0;
        int j=0;
        while(j<trainers.length && i< players.length){
            if(players[i]<=trainers[j]) {
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
            
        }
        return count;
    }
}