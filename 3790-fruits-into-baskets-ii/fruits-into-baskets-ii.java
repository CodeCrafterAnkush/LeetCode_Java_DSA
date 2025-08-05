class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count =0;
        // boolean isAvailable []=new boolean[baskets.length];
        // for(int i=0;i<fruits.length;i++){
        //     boolean isPlaced = false;
        //     for(int j =0;j<baskets.length;j++){
        //         if(!isAvailable[j] && fruits[i]<= baskets[j]){
        //             isAvailable[j] = true;
        //             isPlaced =true;
        //             break;
        //         }
        //     }
        //     if(!isPlaced){
        //         count++;
        //     }
        // }

        for(int i=0;i<fruits.length;i++){
            boolean isPlaced = false;
            for(int j =0;j<baskets.length;j++){
                if(baskets[j]!=0 && fruits[i]<= baskets[j]){
                    baskets[j] = 0;
                    isPlaced =true;
                    break;
                }
            }
            if(!isPlaced){
                count++;
            }
        }

        return count;
    }
}