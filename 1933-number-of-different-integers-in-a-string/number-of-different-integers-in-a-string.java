class Solution {
    public int numDifferentIntegers(String word) {
        HashSet<String> set = new HashSet<>();
        String nums[] = word.split("[a-zA-Z]+");
        Long arr[]=new Long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (!nums[i].isEmpty()) {
                String trimmed = nums[i].replaceFirst("^0+(?!$)", "");
                set.add(trimmed);
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        //         set.add(arr[i]);
        // }

        return set.size();

    }
}