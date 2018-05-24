package CodingChallengeEasy.fromDay11;

/**
 * Created by yzhang on 5/23/18.
 */
public class Day16LC476 {
    public int findComplement(int num){
        int max = num;
        max |= max >> 1;
        max |= max >> 2;
        max |= max >> 4;
        max |= max >> 8;
        max |= max >> 16;
        return num ^ max;
    }
}
