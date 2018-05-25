package easy.string.reversestring;

public class Solution {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length / 2; i++) {
            char temp = chars[i];
            int index = chars.length-1-i;
            chars[i] = chars[index];
            chars[index] = temp;
        }
        return new String(chars);
    }
}
