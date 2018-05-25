package easy.string.validpalindrom;

public class Solution {

    private static boolean isAlphaNumeric(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }

    public boolean isPalindrome(String s) {
        char[] array = s.toCharArray();
        int right = array.length - 1;
        if(s.length() == 1) {
            return true;
        }
        for(int left=0; left <= right; left++) {
            while(right > 0 && !isAlphaNumeric(array[right])) {
                right--;
            }
            if(!isAlphaNumeric(array[left])) {
                continue;
            }
            if(Character.toLowerCase(array[left]) != Character.toLowerCase(array[right])) {
                return false;
            }
            right--;
        }
        return true;
    }
}
