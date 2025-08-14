class Solution {
    public String largestGoodInteger(String num) {
        String []arr = {"999","888","777","666","555","444","333","222","111","000"};
        for(int i=0;i<arr.length;i++){
            if(num.contains(arr[i]))return arr[i];
        }
        // int maxNum = Integer.MIN_VALUE;
        // char []chars = num.toCharArray();
        // int i=0;
        // int j=i+1;
        // int k=j+1;
        // while(k<chars.length){
        //     if(chars[i]==chars[j]&& chars[j]==chars[k]&& chars[k]==chars[i]){
        //         int n = Integer.parseInt(""+chars[i]+chars[j]+chars[k]);
        //         if(n>maxNum){
        //             maxNum = n;
        //         }
        //     }
        //     i++;
        //     j++;
        //     k++;
        // }
        // return (maxNum==Integer.MIN_VALUE)?"":maxNum + "";
        return "";
    }
}