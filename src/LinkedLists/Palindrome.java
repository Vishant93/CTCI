package LinkedLists;

public class Palindrome {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        while (head.next != null) {
            if (head != prev) return false;
            else {
                head = head.next;
                prev = prev.next;
            }
        }
        return true;
    }
}
