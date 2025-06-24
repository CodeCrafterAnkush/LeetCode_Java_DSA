class Solution {
    public String[] divideString(String s, int k, char fill) {
        // List<String> stringList = new ArrayList<>();
        // int i=0;
        // StringBuilder str = new StringBuilder();
        // while(i<s.length()){
        //     str.append(s.charAt(i));
        //     if(str.length() == k){
        //         stringList.add(str.toString());
        //         str = new StringBuilder();
        //     }
        //     if(i==s.length()-1 && str.length() < k && str.length() > 0){
        //         while(str.length()<k){
        //             str.append(fill);
        //         }
                
        //         stringList.add(str.toString());
        //     }
        //     i++;
        // }    

        StringBuilder str = new StringBuilder(s);

        while(str.length()%k != 0){
            str.append(fill);
        }
        StringBuilder tempStr = new StringBuilder();
        String [] stringArray = new String[str.length()/k];
        int j=0;
        for(int i=0;i<str.length();i++){
            tempStr.append(str.charAt(i));
            if(tempStr.length()==k){
                stringArray[j] = tempStr.toString();
                tempStr = new StringBuilder();
                j++;
            }
        }

         return stringArray;
    }
}