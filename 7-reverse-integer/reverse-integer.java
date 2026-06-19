class Solution {
    public int reverse(int x) {
        int num = Math.abs(x);
        int sign =(x < 0)?-1:1;
        int rev = 0;
        while(num  >0){
            int digit = num % 10;
            // System.out.println(digit);
            // Check for overflow
             if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            rev = rev * 10 + digit;
            // System.out.println(rev);
            num /=10;
            // System.out.println(num);
        }
        rev *= sign;
        
        return rev;            
    }
}