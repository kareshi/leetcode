package easy.string.longestcommonprefix;

public class Solution {

    /*String longestCommonPrefix(String s1, String s2) {
        if(s1 == null || s2 == null) {
            return "";
        }
        char[] small;
        char[] big;
        if(a1.length <= a2.length) {
            small = s1.toCharArray();
            big = s2.toCharArray();
        } else {
            small = s2.toCharArray();
            big = s1.toCharArray();
        }


    }*/

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        if(strs.length == 1) {
            return strs[0];
        }

        int indexShortest = 0;

        for(int i=0; i < strs.length; i++) {
            if(strs[i].length() < strs[indexShortest].length()) {
                indexShortest = i;
            }
        }

        char[] array = strs[indexShortest].toCharArray();
        int size =0;
        boolean doContinue = true;
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<strs.length; j++) {
                if(strs[j].charAt(i) != array[i]) {
                    doContinue = false;
                    break;
                }
            }
            if(!doContinue) {
                break;
            }
            size++;
        }

        char[] result = new char[size];
        for(int i=0; i<size; i++) {
            result[i] = array[i];
        }
        return new String(result);
    }
}