package easy.array.plusone;

public class Solution {

    public int[] plusOne(int[] digits) {
        boolean max = false;
        int stop = digits.length-1;
        for(int i=stop; i >=0; i--) {
            int value = (digits[i] + 1) % 10 ;
            int retenue = (digits[i] + 1) / 10;
            digits[i]=value;
            if(retenue == 0) {
                break;
            } else {
                if(i == 0) {
                    int[] result = new int[digits.length+1];
                    result[0] = 1;
                    return result;
                }
            }
        }
        return digits;
    }
}
