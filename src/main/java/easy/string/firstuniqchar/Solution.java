package easy.string.firstuniqchar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int firstUniqChar(String s) {
        if(s.length() > 0) {
            if(s.length() > 1) {
                char[] chars = s.toCharArray();
                List<Character> uniqChars = new ArrayList<>();
                Arrays.sort(chars);
                if(chars[0] != chars[1]) {
                    uniqChars.add(chars[0]);
                }
                for(int i = 1; i < chars.length -1; i++) {
                    if(chars[i] != chars[i+1] && chars[i] != chars[i-1]) {
                        uniqChars.add(chars[i]);
                    }
                }
                if(chars[chars.length - 1] != chars[chars.length - 2]) {
                    uniqChars.add(chars[chars.length - 1]);
                }

                chars = s.toCharArray();
                for(int i=0; i<chars.length; i++) {
                    if(uniqChars.contains(chars[i])) {
                        return i;
                    }
                }
            } else {
                return 0;
            }
        }
        return -1;
    }
}