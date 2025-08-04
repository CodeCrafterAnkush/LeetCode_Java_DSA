class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     set.add(nums[i]);
        // }
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int n : set){
        //     list.add(n);
        // }
        // Collections.sort(list);
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

    //   for(int i=0;i<nums.length;i++){
    //     int count=0;
    //     for(int j=0;j<nums.length;j++){
    //         if(nums[i]>nums[j])count++;
    //     }
    //     arr[i]=count;
    //   }  
      return arr;
    }
}