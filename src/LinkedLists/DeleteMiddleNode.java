package LinkedLists;

public class DeleteMiddleNode {
    public static boolean deleteNode(ListNode n) {
        if (n == null || n.next == null) return false;
        ListNode next = n.next;
        n.val = next.val;
        n.next = next.next;
        return true;
    }
}
