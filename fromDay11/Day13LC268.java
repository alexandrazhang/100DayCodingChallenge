package CodingChallengeEasy.fromDay11;

public class Day13LC268 {
    public int missingNumber(int[] nums) {
        int miss = 0;
        for(int i = 0; i < nums.length; i++) {
            miss += i - nums[i];
        }
        return miss + nums.length;
    }
}
