package CodingChallengeEasy.FromDay4;

import laioffer.laicode.ListNode;

public class Day7LC206 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head;
        newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
