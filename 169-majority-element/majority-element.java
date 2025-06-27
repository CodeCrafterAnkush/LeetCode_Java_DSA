class Solution {
    public int majorityElement(int[] nums) {
        // int candidate = nums[0];
        //  int count=0;
        //  for(int i = 0;i<nums.length;i++){
           
        //     if(count==0){
        //         candidate=nums[i];
        //         count++;
        //     }else if(candidate!=nums[i]){
        //         count--;
        //     }else{
        //         count++;
        //     }
        //  } 
        //  return candidate;



// second way Appna college
        HashMap<Integer,Integer> map = new HashMap<>();
         int majorityElement = -1;//in case where {1,2},{1,1,1,1,2,2,2,2} etc it returns -1

        for(int i=0;i<nums.length;i++ ){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
       
        for(int key : map.keySet()){
            if(map.get(key) > nums.length/2){
                majorityElement = key;
            }
        }
        return majorityElement;
    }
}