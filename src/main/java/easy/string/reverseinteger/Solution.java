package easy.string.reverseinteger;

public class Solution {


    private String reverseString(String s) {
        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length / 2; i++) {
            char temp = chars[i];
            int index = chars.length-1-i;
            chars[i] = chars[index];
            chars[index] = temp;
        }
        return new String(chars);
    }

    public int reverse(int x) {
        String string = new String(""+x);
        boolean isNegative = false;
        if(string.indexOf("-") == 0) {
            isNegative = true;
            string = string.substring(1);
        }
        String temp = reverseString(string);
        int result = 0;
        try {
            result = Integer.parseInt(temp);
        } catch (NumberFormatException ex) {
        }
        if(isNegative) {
            result = result * -1;
        }
        return result;
    }
}