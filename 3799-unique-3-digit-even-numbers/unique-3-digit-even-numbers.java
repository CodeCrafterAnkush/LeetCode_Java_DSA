class Solution {
    // public HashSet<Integer> uniqueNumbers = new HashSet<>();
    // public void count3DigitUniqueEvenNo(int[]digits, StringBuilder sb, boolean[]visited){
    //     if(sb.length()==3){
    //         int n = Integer.parseInt(sb.toString());
    //         if(n % 2 ==0)uniqueNumbers.add(n);
    //         return;
    //     }

    //     for(int i=0;i<digits.length;i++){
    //         if(sb.length()==0 && digits[i]==0)continue;
    //         if(!visited[i]){
    //             visited[i]=true;
    //             sb.append(digits[i]);
    //             count3DigitUniqueEvenNo(digits,sb,visited);
    //             sb.deleteCharAt(sb.length() - 1);
    //             visited[i]=false;

    //         }
    //     }

    // }
    public int totalNumbers(int[] digits) {
        // boolean [] visited = new boolean[digits.length];
        // StringBuilder sb = new StringBuilder();
        // count3DigitUniqueEvenNo(digits,sb,visited);
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            if(digits[i]==0)continue;
            for(int j=0;j<n;j++){
                if(j==i)continue;
                for(int k=0;k<n;k++){
                    if(k==i || k==j)continue;
                    if(digits[k] % 2 == 0){
                        int digit = digits[i]*100+digits[j]*10+digits[k];
                    uniqueNumbers.add(digit);
                    }
                    
                }
            }
        }
        return uniqueNumbers.size();

    }
}