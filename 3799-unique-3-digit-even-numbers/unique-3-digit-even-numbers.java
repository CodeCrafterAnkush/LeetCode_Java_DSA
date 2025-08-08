class Solution {
    public HashSet<Integer> uniqueNumbers = new HashSet<>();
    public void count3DigitUniqueEvenNo(int[]digits, StringBuilder sb, boolean[]visited){
        if(sb.length()==3){
            int n = Integer.parseInt(sb.toString());
            if(n % 2 ==0)uniqueNumbers.add(n);
            return;
        }

        for(int i=0;i<digits.length;i++){
            if(sb.length()==0 && digits[i]==0)continue;
            if(!visited[i]){
                visited[i]=true;
                sb.append(digits[i]);
                count3DigitUniqueEvenNo(digits,sb,visited);
                sb.deleteCharAt(sb.length() - 1);
                visited[i]=false;

            }
        }

    }
    public int totalNumbers(int[] digits) {
        boolean [] visited = new boolean[digits.length];
        StringBuilder sb = new StringBuilder();
        count3DigitUniqueEvenNo(digits,sb,visited);
        return uniqueNumbers.size();
    }
}