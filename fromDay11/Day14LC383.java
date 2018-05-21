package CodingChallengeEasy.fromDay11;

import java.util.HashMap;
import java.util.Map;

public class Day14LC383 {
    public Day14LC383() {
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        char[] mch = magazine.toCharArray();
        char[] rch = ransomNote.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : mch) {
            int n = map.getOrDefault(ch, 0);
            if(n == 0) {
                map.put(ch, 1);
            } else {
                map.put(ch, ++n);
            }
        }
        for(char ch : rch) {
            int n = map.getOrDefault(ch, 0);
            if(n == 0) {
                return false;
            } else if(n == 1){
                map.remove(ch);
            } else {
                map.put(ch, --n);
            }
        }
        return true;
    }
}
