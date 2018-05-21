package CodingChallengeEasy.fromDay1;

import java.util.Arrays;

public class Day7LC169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[(nums.length - 1)/2];
    }
}
