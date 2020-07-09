package LinkedLists;

public class SumLists {
    public ListNode sumList(ListNode a, ListNode b) {
        int carry = 0;
        ListNode p = null, dummy = new ListNode(0);
        while (a != null || b != null || carry != 0) {
            if (a != null) {
                carry += a.val;
                a = a.next;
            }
            if (b != null) {
                carry += b.val;
                b = b.next;
            }
            p.next = new ListNode(carry%10);
            carry /= 10;
            p = p.next;
        }
        return dummy.next;
    }
}
