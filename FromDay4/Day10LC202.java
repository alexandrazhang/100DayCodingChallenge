package CodingChallengeEasy.FromDay4;

public class Day10LC202 {
    public boolean isHappy(int n) {
        if(n == 1 || n == 7) {
            return true;
        }
        if(n < 10) {
            return false;
        }
        while(n >= 10) {
            String s = new String().valueOf(n);
            char[] chars = s.toCharArray();
            int sum = 0;
            for(char ch : chars) {
                sum += Math.pow((ch - '0'), 2);
            }
            n = sum;
            if(n == 1) {
                return true;
            }
        }
        return false;
    }
}
