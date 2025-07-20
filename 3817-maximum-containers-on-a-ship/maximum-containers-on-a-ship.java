class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        // int containerLoaded = 1;
        // int totalContainerWeight =0;
        // while(containerLoaded<=place && totalContainerWeight<=maxWeight){
        //     totalContainerWeight+=w;
        //     containerLoaded++;
        //     // i++;
        // }

        int place =n*n;
        for(int i=0;i<=place;i++){
            if(i*w > maxWeight){
                return i-1;
            }
        }

        return place;
    }
}