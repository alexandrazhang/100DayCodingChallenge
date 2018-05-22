package CodingChallengeEasy.fromDay11;

import java.util.ArrayList;
import java.util.List;

public class Day15LC448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> n = new ArrayList<>();
        for(int i = 0 ; i < nums.length; i++) {
            if(nums[Math.abs(nums[i]) - 1] > 0) {
                nums[Math.abs(nums[i]) - 1] *= -1;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) n.add(i + 1);
        }
        return n;
    }
}
