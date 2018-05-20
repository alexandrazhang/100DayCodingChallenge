package CodingChallengeEasy.fromDay11;

import laioffer.laicode.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Day12LC160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> nodes = new HashSet<>();
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA != null) {
            if(nodes.add(tempA)){
                tempA = tempA.next;
            } else {
                return tempA;
            }
        }
        while (tempB != null) {
            if(nodes.add(tempB)) {
                tempB = tempB.next;
            }else {
                return tempB;
            }
        }
        return null;
    }
}
