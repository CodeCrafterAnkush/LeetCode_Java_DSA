class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        
        int sum=map.get(s.charAt(s.length()-1)+"");
        for(int len=s.length()-1 ; len>0;len--){
             int left=map.get(s.charAt(len-1)+"");
             int right=map.get(s.charAt(len)+"");

            if(left<right){
                sum-=left;
            }else{
                sum+=left;
            }

        }
        return sum;
        
    }
}