package CodingChallengeEasy.fromDay11;

import java.util.HashMap;
import java.util.Map;

public class Day15LC760 {
    public int[] anagramMappings(int[] A, int[] B) {
        int[] p = new int[A.length];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < A.length; i++) {
            map.put(B[i], i);
        }
        for(int i = 0; i < A.length; i++) {
            p[i] = map.get(A[i]);
        }
        return p;
    }
}
