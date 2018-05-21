package CodingChallengeEasy.fromDay1;

public class Day6LC657 {
    public boolean judgeCircle(String moves) {
        int[]pos = new int[]{0, 0};
        char[] chs = moves.toCharArray();
        for(char ch: chs) {
            switch(ch) {
                case 'U' :
                    pos[1]++;
                    break;
                case 'D': pos[1]--; break;
                case 'L': pos[0]--; break;
                case 'R': pos[0]++; break;
                default: break;
            }
        }
        if(pos[0] == 0 && pos[1] == 0) {
            return true;
        } else {
            return false;
        }
    }
}
