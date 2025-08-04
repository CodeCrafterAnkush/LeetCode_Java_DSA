class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int arr[]= new int [nums.length];
        for(int i=0;i<arr.length;i++){
           arr[i]=nums[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
           if(!map.containsKey(arr[i])){
            map.put(arr[i],i);
           }else{
            map.put(arr[i],map.get(arr[i]));
           }
        }
        for(int i=0;i<nums.length;i++){
           if(map.containsKey(nums[i])){
            arr[i]=map.get(nums[i]);
           }
        }
      return arr;
    }
}