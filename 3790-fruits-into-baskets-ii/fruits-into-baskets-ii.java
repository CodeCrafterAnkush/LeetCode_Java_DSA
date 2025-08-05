class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        Stack<Integer> count = new Stack<>();
        boolean isAvailable []=new boolean[baskets.length];
        for(int i=0;i<fruits.length;i++){
            for(int j =0;j<baskets.length;j++){
                if(!isAvailable[j] && fruits[i]<= baskets[j]){
                    isAvailable[j] = true;
                    count.push(fruits[i]);
                    break;
                }
            }
        }

        return fruits.length-count.size();
    }
}