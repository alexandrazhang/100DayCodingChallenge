package CodingChallengeEasy;

/**
 * Created by yzhang on 5/7/18.
 */
public class Day2LC771 {
    public int numJewelsInStones(String J, String S) {
        char[] ss = S.toCharArray();
        int count = 0;
        for(int i = 0; i < ss.length; i++) {
            if(J.indexOf(ss[i]) >= 0) {
                count++;
            }
        }
        return count;
    }
}
