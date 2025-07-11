class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0 ;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            else{
                map.put(nums[i],i);//here nums[i] is the key and 'i' is the value of this key
            }
        }
      return false; 
    }
}