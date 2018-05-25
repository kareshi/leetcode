package easy.string.strstr;

public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) {
            return 0;
        }
        char[] foin = haystack.toCharArray();
        char[] aiguille = needle.toCharArray();
        int found = 0;
        int reversePoint = 0;
        for(int i=0; i<foin.length; i++) {
            if(found > 0 && reversePoint == 0 && aiguille[0] == foin[i]) {
                reversePoint = i;
            }
            if(foin[i] == aiguille[found]) {
                found++;
                if(found == aiguille.length) {
                    return i -(found - 1);
                }
            } else {
                found = 0;
                if(reversePoint > 0) {
                    i = reversePoint - 1;
                    reversePoint = 0;
                }
            }
        }
        return -1;
    }
}
