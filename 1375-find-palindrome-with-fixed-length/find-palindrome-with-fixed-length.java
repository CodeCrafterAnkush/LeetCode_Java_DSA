class Solution {
    public long[] kthPalindrome(int[] queries, int intLength) {
        int digitLength = (intLength + 1) / 2;
        // int arrSize = (int) (9 * Math.pow(10, digitLength - 1));
        // if((digitLength%2) == 0){
        //     arrSize = (int)(9 * Math.pow(10, digitLength - 1));
        // }else{
        //     arrSize = (int)(9 * Math.pow(10, digitLength - 2));
        // }
        // String arrFreq[] = new String[arrSize];
        // int lowerBound = (long)(Math.pow(10, digitLength - 1));
        long lowerBound = (int) Math.pow(10, (digitLength - 1));
        long upperBound = (int) Math.pow(10, (digitLength)) - 1;
        // int j = 0;
        // for (long i = lowerBound; i <= upperBound && j < arrSize; i++, j++) {
        //     arrFreq[j] = String.valueOf(i);
        // }
        long result[] = new long[queries.length];

        for (int i = 0; i < queries.length; i++) {
            long halpPart =(lowerBound+queries[i])-1;
            StringBuilder palindrome = new StringBuilder(String.valueOf(halpPart));
            if(halpPart>upperBound){
                result[i]=-1;
                continue;
            }
            if (intLength % 2 == 0) {
                palindrome.append(new StringBuilder(palindrome).reverse());
            } else {
                palindrome.append(new StringBuilder(palindrome.substring(0, palindrome.length() - 1)).reverse());
            }
            result[i] = Long.parseLong(palindrome.toString());   


        }

        return result;
    }
}