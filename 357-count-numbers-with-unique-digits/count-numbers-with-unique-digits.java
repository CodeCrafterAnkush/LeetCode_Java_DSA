class Solution {
    // public boolean isUnique(long n) {
    //     int[] arr = new int[10];
    //     if (n == 0)
    //         return true;
    //     while (n != 0) {
    //         int temp = (int) (n % 10);
    //         if (arr[temp] == 1) {
    //             arr[temp] = 0;
    //             return false;
    //         } else {
    //             arr[temp] = 1;
    //             n = n / 10;
    //         }
    //     }
    //     return true;
    // }

    public int countNumbersWithUniqueDigits(int n) {
        // int count = 0;
        // for (long i = 0; i < ((long) Math.pow(10, n)); i++) {
        //     if (isUnique(i)) {
        //         count++;
        //     }
        // }
        if(n==0)return 1;
        int firstUniques = 10;
        int avilableUniques=9;
        int count =9;
        for(int i=2;i<=n && avilableUniques>0 ;i++){
            count *=avilableUniques;
            firstUniques+=count;
            avilableUniques--; 
        }       

        return firstUniques;
    }
}