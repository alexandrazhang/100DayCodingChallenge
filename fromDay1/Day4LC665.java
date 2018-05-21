package CodingChallengeEasy.fromDay1;

public class Day4LC665 {
    public boolean checkPossibility(int[] nums) {
        if(nums == null || nums.length <= 2) {
            return true;
        }
        int count = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < nums[i - 1]) {
                count++;
                if(i < 2 || nums[i - 2] <= nums[i]) {
                    nums[i - 1] = nums[i];
                } else {
                    nums[i] = nums[i - 1];
                }
            }
            if(count >= 2) {
                return false;
            }
        }
        return count <= 1;
    }
}
