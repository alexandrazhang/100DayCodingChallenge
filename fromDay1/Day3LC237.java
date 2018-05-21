package CodingChallengeEasy.fromDay1;

import laioffer.laicode.ListNode;

public class Day3LC237 {
    public void deleteNode(ListNode node) {
        node.value = node.next.value;
        node.next = node.next.next;
    }
}
