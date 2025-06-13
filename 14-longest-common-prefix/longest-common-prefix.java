class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix= new StringBuilder("");
        Arrays.sort(strs); // sort array of string
        String first=strs[0];
        String last=strs[strs.length-1];
           int j=0;
           while(j<Math.min(first.length(),last.length())){
        if(first.charAt(j)==last.charAt(j)){
             prefix.append(first.charAt(j));
            }else{
                 return prefix.toString();
                }
             j++;
            }
        return prefix.toString();
    }
}