package CodingChallengeEasy.FromDay4;

public class Day8LC191 {
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0) {
            if((n & 1) != 0) {
                count++;
            }
             n >>>= 1;
        }
        return count;
    }
}