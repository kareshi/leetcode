package easy.array.plusone;

public class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        int value;
        do {
            value = digits[i];
            if(value < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
                i--;
            }
        } while(i >= 0);
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }
}