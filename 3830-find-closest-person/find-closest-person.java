class Solution {
    public int findClosest(int x, int y, int z) {
        int preson1 = Math.abs(x-z);
        int preson2 = Math.abs(y-z);
        if(preson1 < preson2)return 1;
        else if(preson2 < preson1)return 2;
        else return 0;
    }
}