class Solution {
    public boolean asteroidsDestroyed(int mass, int[] astros) {
        Arrays.sort(astros);
        long m = mass;
        // int i=0;
        // while(i<astros.length){
        //     if(m >= astros[i]) m+= astros[i];
        //     else return false;
        //     i++;
        // }

        for(int astroid :astros){
            if(m-astroid<0){
                return false;
            }
            m+=astroid;
        }

        return true;
    }
}