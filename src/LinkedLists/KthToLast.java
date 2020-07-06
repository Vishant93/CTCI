package LinkedLists;

public class KthToLast {
    public ListNode kthElement(ListNode head, int k) {
        if (head == null) return null;
        int count = 1;
        ListNode trav = head;
        while(trav.next != null) {
            trav = trav.next;
            count++;
        }
        trav = head;
        if (count > k) return null;
        for (int i = 0; i <= (count-k); i++) {
            if (i == (count-k)) {
                return trav;
            }
            else {
                trav = trav.next;
            }
        }
        return null;
    }
}
