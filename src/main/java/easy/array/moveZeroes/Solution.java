package easy.array.moveZeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        int nbMove =0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==0) {
                nbMove++;
            } else {
                nums[i-nbMove] = nums[i];
            }
        }
        for(int i=0; i<nbMove; i++) {
            nums[nums.length-(i+1)]= 0;
        }

    }
}