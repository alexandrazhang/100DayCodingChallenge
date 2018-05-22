package CodingChallengeEasy.fromDay11;

import java.util.ArrayList;
import java.util.List;

public class Day15LC728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        int self = right < 10 ? right : 9;

        for(int i = left; i <= self; i++) {
                res.add(i);
        }
        if(right <= 10) {
            return res;
        }

        for(int i = left; i < right; i++) {
            if(isDiv(i)) res.add(i);
        }
        return res;
    }

    private boolean isDiv(int n) {
        int or = n;
        while(n > 1) {
            int temp = n % 10;
            if(temp == 0) return false;
            if(or % temp != 0) return false;
            n /= 10;
        }
        return true;
    }
}
