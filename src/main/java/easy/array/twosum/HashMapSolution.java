package easy.array.twosum;

import java.util.HashMap;
import java.util.Map;

class HashMapSolution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length < 2) {
            throw new IllegalArgumentException("nums must have at least 2 elements");
        }

        Map<Integer,Integer> valuePositions = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int lookup = target - nums[i];
            Integer position = valuePositions.get(lookup);
            if(position != null) {
                return new int[]{position, i};
            } else {
                valuePositions.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
