package LinkedLists;

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class RemoveDups {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode trav = head;
        while (trav != null && trav.next != null) {
            if (trav.val == trav.next.val) {
                trav.next = trav.next.next;
            }
            else
            {
                trav = trav.next;
            }
        }
        return head;
    }
}
