package CodingChallengeEasy.fromDay11;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingDeque;

public class Day13LC242 {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> included = new HashMap<>();
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        for(char ch : ss) {
            int num = included.getOrDefault(ch, 0);
            if(num == 0){
                included.put(ch, 1);
            } else {
                included.put(ch, ++num);
            }
        }
        for(char ch : ts) {
            int n = included.getOrDefault(ch, 0);
            if(n == 0) {
                return false;
            } else if(n == 1){
                included.remove(ch);
            }else {
                included.put(ch, --n);
            }
        }
        if(included.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
