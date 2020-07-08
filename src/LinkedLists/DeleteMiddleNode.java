package LinkedLists;

public class DeleteMiddleNode {
    public static boolean deleteNode(LinkedListNode n) {
        if (n == null || n.next == null) return null;
        LinkedListNode next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }
}
