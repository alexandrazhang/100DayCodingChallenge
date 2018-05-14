package CodingChallengeEasy.FromDay4;

public class Day8LC283 {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length <= 1) {
            return;
        }
        int slow = 0;
        int fast = 1;
        while(fast < nums.length) {
            if(nums[slow] == 0) {
                if(nums[fast] != 0) {
                    swap(nums, slow, fast);
                    slow++;
                }

            } else {
                slow++;
            }
            fast++;

        }
    }
    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
