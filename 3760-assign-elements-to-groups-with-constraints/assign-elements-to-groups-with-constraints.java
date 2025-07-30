class Solution {
    public int[] assignElements(int[] groups, int[] elements) {
        int result[] = new int[groups.length];
        Arrays.fill(result, -1);

        HashMap<Integer,Integer> elementIdx = new HashMap<>();
        for (int i = 0; i < elements.length; i++) {
            if (!elementIdx.containsKey(elements[i])) {
                elementIdx.put(elements[i], i);
            }
        }

        for(int i=0;i<groups.length;i++){
            int val = groups[i];
            int minIdx = Integer.MAX_VALUE;
            for(int j=1;j * j <=val;j++){
                if(val % j ==0){
                    int divisor1=j;
                    int divisor2=groups[i]/j;

                    if(elementIdx.containsKey(divisor1)){
                        minIdx = Math.min(minIdx,elementIdx.get(divisor1));
                        // result[i]=minIdx;
                    }
                    if(elementIdx.containsKey(divisor2)){
                        minIdx = Math.min(minIdx,elementIdx.get(divisor2));
                        // result[i]=minIdx;
                    }
                }
            }
            result[i] = (minIdx == Integer.MAX_VALUE) ? -1 : minIdx;
        }
        return result;
    }
}