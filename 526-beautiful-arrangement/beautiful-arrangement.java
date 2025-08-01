class Solution {
    public int count = 0;

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void helper(int idx, int[] arr) {
        if (idx == arr.length) {
            count++;
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            swap(arr, i, idx);
            if (arr[idx] % (idx + 1) == 0 || (idx + 1) % arr[idx] == 0)
                helper(idx + 1, arr);
            swap(arr, i, idx);
        }
        return;
    }

    public int countArrangement(int n) {
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        helper(0, nums);
        return count;
    }
}