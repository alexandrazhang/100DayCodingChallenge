package CodingChallengeEasy.FromDay4;

import java.util.HashSet;
import java.util.Set;

public class Day10LC217 {
    public boolean containsDuplicate(int[] nums) {
        if(nums == null) {
            return false;
        }
        Set<Integer> ns = new HashSet<>();
        for(int n : nums) {
            if(!ns.add(n)) {
                return true;
            }
        }
        return false;
    }
}
