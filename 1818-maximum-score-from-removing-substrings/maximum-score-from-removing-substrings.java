class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x > y) {
            return removeInOrder(s, "ab", x, "ba", y);
        } else {
            return removeInOrder(s, "ba", y, "ab", x);
        }
    }

    private int removeInOrder(String s, String firstPair, int firstScore, String secondPair, int secondScore) {
        Stack<Character> stack = new Stack<>();
        int score = 0;

        // First pass: remove firstPair
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == firstPair.charAt(0) && ch == firstPair.charAt(1)) {
                stack.pop();
                score += firstScore;
            } else {
                stack.push(ch);
            }
        }

        // Now convert stack back to string (in reverse order)
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        // Second pass: remove secondPair from reversed string
        stack.clear();
        for (int i = sb.length() - 1; i >= 0; i--) {
            char ch = sb.charAt(i);
            if (!stack.isEmpty() && stack.peek() == secondPair.charAt(0) && ch == secondPair.charAt(1)) {
                stack.pop();
                score += secondScore;
            } else {
                stack.push(ch);
            }
        }

        return score;
    }
}
