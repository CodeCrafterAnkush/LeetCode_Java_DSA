class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> stringList = new ArrayList<>();
        int i=0;
        StringBuilder str = new StringBuilder();
        while(i<s.length()){
            // str += s.charAt(i);
            str.append(s.charAt(i));
            if(str.length() == k){
                stringList.add(str.toString());
                str = new StringBuilder();
            }
            if(i==s.length()-1 && str.length() < k && str.length() > 0){
                // while(str.length()<k){
                //     str+=fill;
                // }
                
                stringList.add(str.toString());
            }
            i++;
        }

        String [] stringArray = stringList.toArray(new String[0]);
        String lastStr =stringArray[stringArray.length-1];
         if(lastStr.length()<k){
            while(lastStr.length()<k){
                lastStr += fill;
            }
            stringArray[stringArray.length-1]=lastStr;
         }

         return stringArray;
    }
}