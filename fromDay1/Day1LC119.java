package CodingChallengeEasy.fromDay1;

import java.util.ArrayList;
import java.util.List;

public class Day1LC119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        List<List<Integer>> triangle = new ArrayList<>();
        row.add(1);
        triangle.add(row);
        for(int i = 1; i <= rowIndex; i++) {
            row = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(triangle.get(i -1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }
        return row;
    }
}
