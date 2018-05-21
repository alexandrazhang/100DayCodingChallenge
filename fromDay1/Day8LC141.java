package CodingChallengeEasy.fromDay1;

import laioffer.laicode.ListNode;

public class Day8LC141 {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && slow != null && fast.next != null && slow.next != null) {
            if(fast.next == slow) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
