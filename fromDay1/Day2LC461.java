package CodingChallengeEasy.fromDay1;

/**
 * Created by yzhang on 5/7/18.
 */
public class Day2LC461 {
    public int hammingDistance(int x, int y) {
        int n = x ^ y;
        int count = 0;
        while(n > 0) {
            count += (n & 1);
            n >>>= 1;
        }
        return count;
    }

}
