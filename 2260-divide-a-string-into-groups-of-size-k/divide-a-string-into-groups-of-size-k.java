class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> stringList = new ArrayList<>();
        int i=0;
        String str = "";
        while(i<s.length()){
            str += s.charAt(i);
            if(str.length() == k){
                stringList.add(str);
                str ="";
            }
            if(i==s.length()-1 && str.length() < k && str != ""){
                // while(str.length()<k){
                //     str+=fill;
                // }
                
                stringList.add(str);
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