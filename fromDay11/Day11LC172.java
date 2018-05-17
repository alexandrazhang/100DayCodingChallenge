package CodingChallengeEasy.fromDay11;

public class Day11LC172 {
    public int trailingZeroes(int n) {
        int res = 0;
        while(n >= 5) {
            res += n/5;
            n = n / 5;
        }
        return res;
    }
}
