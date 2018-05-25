package easy.string.atoi;

public class Solution {

    private static final int INITIAL = 0;
    private static final int MINUS = 1;
    private static final int PLUS = 1;
    private static final int NUMERIC = 2;

    public int myAtoi(String str) {
        char[] array = str.toCharArray();
        int result = 0;
        boolean isMinus = false;
        int state = INITIAL;
        for(int i=0; i<str.length(); i++) {
            if(' ' == array[i]) {
                if(state == INITIAL) {
                    continue;
                } else {
                    break;
                }

            } if('+' == array[i]) {
                if(state == INITIAL) {
                    state = PLUS;
                } else {
                    break;
                }
            } else if('-' == array[i]) {
                if(state == INITIAL) {
                    isMinus = true;
                    state = MINUS;
                } else {
                    break;
                }
            } else if(Character.isDigit(array[i])) {
                try {
                    result = Math.addExact(Math.multiplyExact(result, 10), Character.getNumericValue(array[i]));
                    state = NUMERIC;
                } catch (ArithmeticException ex) {
                    if(isMinus) {
                        return Integer.MIN_VALUE;
                    } else {
                        return Integer.MAX_VALUE;
                    }
                }
            } else {
                break;
            }
        }
        if(isMinus) {
            result = result * -1;
        }
        return result;
    }
}