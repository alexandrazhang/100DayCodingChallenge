package CodingChallengeEasy.fromDay1;

/**
 * Created by yzhang on 5/7/18.
 */
public class Day2LC344 {
    public String reverseString(String s) {
        if(s == null) {
            return s;
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while(left < right) {
            swap(chars, left, right);
            left++;
            right--;
        }
        return new String(chars, 0, chars.length);
    }
    private void swap(char[] chs, int left, int right) {
        char temp = chs[left];
        chs[left] = chs[right];
        chs[right] = temp;
    }
}
