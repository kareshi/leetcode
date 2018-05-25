package easy.array.plusone;

public class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        int value;
        do {
            value = digits[i];
            digits[i] = (digits[i] + 1) % 10 ;
            i--;
        } while(i >= 0 && value == 9);

        if(digits[0] == 0) {
            int[] result = new int[digits.length+1];
            result[0] = 1;
            return result;
        }
        return digits;
    }
}