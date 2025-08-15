class Solution {
    public List<String> comboList = new ArrayList<>();
    public void helper(int idx, StringBuilder sb, String[]arr,String digits){
        if(sb.length()==digits.length()){
            String temp = sb.toString();
            comboList.add(temp);
            return;
        }
        
        char ch = digits.charAt(idx);
        String currStr = arr[ch-'0'];
        for(int i=0;i<currStr.length();i++){
            sb.append(currStr.charAt(i));
            helper(idx+1,sb,arr,digits);
            sb.deleteCharAt(sb.length()-1);
        }

    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)return comboList;
        String []arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        helper(0,new StringBuilder(),arr,digits);
        // Map<String,String> keyPad = new HashMap<>();
        // keyPad.put("2","abc");
        // keyPad.put("3","def");
        // keyPad.put("4","ghi");
        // keyPad.put("5","jkl");
        // keyPad.put("6","mno");
        // keyPad.put("7","pqrs");
        // keyPad.put("8","tuv");
        // keyPad.put("9","wxyz");
        return comboList;

    }
}