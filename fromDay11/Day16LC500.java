package CodingChallengeEasy.fromDay11;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by yzhang on 5/23/18.
 */
public class Day16LC500 {
    public String[] findWords(String[] words) {
        String[] res = new String[words.length];
        int index = 0;
        for(String word : words) {
            boolean match = word.matches("([asdfghjklASDFGHJKL]*)|([qwertyuiopQWERTYUIOP]*)|([zxcvbnmZXCVBNM]*)");
            if (match) {
                res[index++] = word;
            }
        }
        return Arrays.copyOf(res, index);
/*        int index = 0;
        String qrow = "poiuytrewqPOIUYTREWQ";
        String aRow = "lkjhgfdsaLKJHGFDSA";
        String zRow = "mnbvcxzMNBVCXZ";
        int row = 0;
        for(int j = 0; j < words.length; j++) {
            char[] chars = words[j].toCharArray();
            boolean add = true;
            for(int i = 0; i < chars.length; i++) {
                int curRow = 0;
                if(qrow.indexOf(words[j].charAt(i)) >= 0) curRow = 1;
                else if(aRow.indexOf(words[j].charAt(i)) >= 0) curRow = 2;
                else if(zRow.indexOf(words[j].charAt(i)) >= 0)curRow = 3;
                if(i == 0) {
                    row = curRow;
                } else if(row != curRow) {
                    add = false;
                    break;
                }
            }
            if(add) {
                res[index++] = words[j];
            }
        }
        return Arrays.copyOf(res, index);*/
    }
}
