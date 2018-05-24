package CodingPractice.src.DayChallengeEasy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by yzhang on 5/23/18.
 */
public class Day16LC387 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()) {
            int temp = map.getOrDefault(ch, 0);
            if(temp == 0) {
                map.put(ch, 1);
            } else {
                map.put(ch, ++temp);
            }
        }
        char[] chs = s.toCharArray();
        for(int i = 0; i < chs.length; i++){
            int temp = map.get(chs[i]);
            if(temp == 1) {
                return i;
            }
        }
        return -1;
    }
}
