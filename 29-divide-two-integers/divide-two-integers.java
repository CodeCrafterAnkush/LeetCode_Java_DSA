class Solution {

    public int divide(int dividend, int divisor) {

        if (dividend == divisor) return 1;

        boolean sign = true; // positive sign

        if (dividend >= 0 && divisor < 0) sign = false;
        if (dividend < 0 && divisor >= 0) sign = false;

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        long ans = 0;

        while (n >= d) {

            int count = 0;

            while (n >= (d << (count + 1))) {
                count++;
            }

            ans += (1L << count);

            n = n - (d << count);
        }

        if (ans >= (1L << 31) && sign == true)
            return Integer.MAX_VALUE;

        if (ans >= (1L << 31) && sign == false)
            return Integer.MIN_VALUE;

        return sign ? (int) ans : (int) -ans;
    }
}