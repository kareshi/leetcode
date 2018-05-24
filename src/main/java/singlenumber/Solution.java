package singlenumber;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int singleNumber(int[] nums) {
        List<Integer> candidates = new ArrayList<Integer>();
        for (int i=0; i<nums.length; i++) {
            int indexOfBrother = candidates.indexOf(nums[i]);
            if(indexOfBrother > -1) {
                candidates.remove(indexOfBrother);
            } else {
                candidates.add(nums[i]);
            }
        }
        return candidates.get(0);
    }

}
