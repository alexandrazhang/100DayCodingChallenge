package CodingChallengeEasy.fromDay11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day14LC349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> n1 = new HashSet<Integer>();
        Set<Integer> n2 = new HashSet<>();
        int[] res = new int[nums2.length];
        for(int i : nums1) {
            n1.add(i);
        }
        for(int i : nums2) {
            n2.add(i);
        }
        int index = 0;
        for(int i : n2) {
            if(!n1.add(i)) {
                res[index] = i;
                index++;
            }
        }
        return Arrays.copyOf(res, index);
    }
}
