class Solution {
    public int numDifferentIntegers(String word) {
        HashSet<String> set = new HashSet<>();
        String nums[] = word.split("[a-zA-Z]+");
        for (int i = 0; i < nums.length; i++) {
            if (!nums[i].isEmpty()) {
                String trimmed = nums[i].replaceFirst("^0+(?!$)", "");
                set.add(trimmed);
            }
        }
        return set.size();

    }
}