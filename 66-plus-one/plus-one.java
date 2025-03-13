class Solution {
    public int[] plusOne(int[] digits) {
       int n = digits.length;
        
        // Traverse from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  // Simply increment and return
                return digits;
            }
            digits[i] = 0;  // Set current digit to 0 and continue
        }

        // If all digits were 9, we need a new array with an extra leading 1
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits; 
    }
}