package CodingChallengeEasy.fromDay11;

public class Day15LC500 {
    public String[] findWords(String[] words) {
        String[] res = new String[words.length];
        int index = 0;
        for(String str : words) {
            if(!str.matches("[POIUYTREWQpoiuytrewq]*|[LLKJHGFDSAlkjhgfdsa]*|[mnbvcxzMNBVCXZ]*")) {
                res[index++] = str;
            }
        }
        return res;
    }
}
