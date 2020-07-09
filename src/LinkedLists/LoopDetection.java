package LinkedLists;

public class LoopDetection {
    public ListNode loopDetection(ListNode n) {
        if (n == null || n.next == null) return null;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) return null;
            else {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return fast;
    }
}
