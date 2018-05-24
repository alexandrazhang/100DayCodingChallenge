package CodingChallengeEasy.fromDay11;

/**
 * Created by yzhang on 5/23/18.
 */
public class Day16LC189 {
    // k = 3 length = 7;
    //
    //              4 5 6 0 1 2 3
    // 0123456      0 1 2 3 4 5 6
    // 1234567 --> [5,6,7,1,2,3,4]
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        shift(nums, 0, nums.length - 1);
        shift(nums, 0, k - 1);
        shift(nums, k, nums.length - 1);
    }
    private void shift(int[] nums, int left, int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            right--;
            left++;
        }
    }
}
