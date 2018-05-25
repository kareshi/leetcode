package easy.string.countandsay;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private String countAndSay(String string) {
        StringBuffer sb = new StringBuffer();
        char[] arr = string.toCharArray();
        int occurence = 1;
        char current = arr[0];
        for(int i=1; i< arr.length; i++) {
            if(arr[i] == current) {
                occurence++;
            } else {
                sb.append(occurence).append(current);
                occurence = 1;
                current = arr[i];
            }
        }
        sb.append(occurence).append(current);
        return sb.toString();
    }

    private void helper(int n, List<String> result) {
        if(n >= 1) {
            result.add("1");
        }
        for(int i=2; i<=n; i++) {
            result.add(countAndSay(result.get(result.size() - 1)));
        }
    }

    public String countAndSay(int n) {
        List<String> result = new ArrayList<>();
        helper(n, result);
        return result.get(result.size()-1);
    }
}