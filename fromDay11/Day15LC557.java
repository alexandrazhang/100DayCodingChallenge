package CodingChallengeEasy.fromDay11;

import java.util.Arrays;

public class Day15LC557 {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int left = 0; // the beginning of each word
        int right = 0; // the end postion of each word
        while(right < chars.length) {
            while(right < chars.length && chars[right] != ' ') {
                right++;
            }
            while(left < chars.length && chars[left] == ' '){
                left++;
            }
            int leftCur = left;
            int rightCur = right - 1;
            while(leftCur < rightCur) {
                swap(chars, leftCur++, rightCur--);
            }
            right++;
            left = right;
        }
        return new String(chars);
    }

    private void swap(char[] chars, int left, int right) {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
    }
}
