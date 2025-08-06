class Solution {
    public int totalFruit(int[] fruits) {
        if(fruits.length==1)return 1;
        Map<Integer, Integer> map = new HashMap<>();
        int left =0;
        int right=0;
        int types = 2;
        int maxLength = 0;
        while(right <fruits.length){
           map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
           if(map.size()>types){
            while(map.size()>types){
                int temp = map.get(fruits[left])-1;
                map.put(fruits[left], temp);
                if(map.get(fruits[left])==0)map.remove(fruits[left]);
                left++;
            }
           }
           if(map.size()<=types){
            maxLength = Math.max(maxLength,right-left+1);
           }
           right++;
        }

        return maxLength;

    }
}