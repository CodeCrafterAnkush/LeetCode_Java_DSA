class Solution {
    public long[] kthPalindrome(int[] queries, int intLength) {
        int digitLength = (intLength + 1) / 2;
        long lowerBound = (int) Math.pow(10, (digitLength - 1));
        long upperBound = (int) Math.pow(10, (digitLength)) - 1;
        long result[] = new long[queries.length];

        for (int i = 0; i < queries.length; i++) {
            long halpPart =(lowerBound+queries[i])-1;
             if(halpPart>upperBound){
                result[i]=-1;
                continue;
            }
            long temp = halpPart;
            if(intLength %2 ==1){
                temp=temp/10;
            }
            while(temp >0){
                halpPart = halpPart *10+temp%10;
                temp = temp/10;
            }
            // StringBuilder palindrome = new StringBuilder(String.valueOf(halpPart));
           
            // if (intLength % 2 == 0) {
            //     palindrome.append(new StringBuilder(palindrome).reverse());
            // } else {
            //     palindrome.append(new StringBuilder(palindrome.substring(0, palindrome.length() - 1)).reverse());
            // }
            // result[i] = Long.parseLong(palindrome.toString());
            result[i]= halpPart;   


        }

        return result;
    }
}