package CodingChallengeEasy;

public class Day2LC371 {
    public int getSum(int a, int b) {
        if(b == 0) {
            return a;
        }
        return getSum(a ^ b, (a & b) << 1);
    }
}
