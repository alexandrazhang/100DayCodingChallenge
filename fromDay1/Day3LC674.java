package CodingChallengeEasy.fromDay1;

public class Day3LC674 {
    public int findLengthOfLCIS(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int max = 1;
        int curMax = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1]) {
                curMax++;
            } else {
                curMax = 1;
            }
            max = Math.max(max, curMax);
        }
        return max;
    }
}
