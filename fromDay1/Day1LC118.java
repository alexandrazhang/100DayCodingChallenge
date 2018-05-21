package CodingChallengeEasy.fromDay1;

import java.util.ArrayList;
import java.util.List;

public class Day1LC118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0) {
            return res;
        }
        List<Integer> row = new ArrayList<>();
        row.add(1);
        res.add(row);
        for(int i = 1; i < numRows; i++){
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    row.add(1);
                } else {
                    int cur = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                    row.add(cur);
                }
            }
            res.add(row);
        }
        return res;
    }
}
