package CodingChallengeEasy;

/**
 * Created by yzhang on 5/7/18.
 */
public class Day2LC292 {
    public boolean canWinNim(int n) {
/*        if(n <= 0) {
            return false;
        }
        boolean[] dp = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(i < 3) {
                dp[i] = true;
            } else if(i == 3) {
                dp[i] = false;
            } else {
                if(dp[i - 1] && dp[i - 2] && dp[i - 3]){
                    dp[i] = false;
                } else {
                    dp[i] = true;
                }
            }
        }
        return dp[n - 1];*/
        if(n % 4 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
