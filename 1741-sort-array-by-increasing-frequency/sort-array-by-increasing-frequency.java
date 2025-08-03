class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int freq = map.get(nums[i]);
                map.put(nums[i],freq+1);
            }else{
                map.put(nums[i],1);
            }
        }
        Integer[] arr = new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        // Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr,(a,b)->{
            int freqOfA =map.get(a);
            int freqOfB=map.get(b);
            if(freqOfA != freqOfB){
                return freqOfA-freqOfB;
            }else{
                return b-a;
            }
        });
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }

        return nums;

    }
}