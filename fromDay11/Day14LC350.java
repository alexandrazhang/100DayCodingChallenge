package CodingChallengeEasy.fromDay11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day14LC350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] res = new int[nums2.length];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int pos1 = 0;
        int pos2 = 0;
        int index = 0;
        while(pos1 < nums1.length && pos2 < nums2.length) {
            if(nums1[pos1] == nums2[pos2]) {
                res[index++] = nums1[pos1];
                pos1++;
                pos2++;
            } else if(nums1[pos1] < nums2[pos2]) {
                pos1++;
            } else {
                pos2++;
            }
        }
        return Arrays.copyOf(res, index);
    }

}
