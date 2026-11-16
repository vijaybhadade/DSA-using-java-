package Day14;

public class Problem206 {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val+" ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ListNode f1 = new ListNode(10);
        ListNode f2 = new ListNode(20);
        ListNode f3 = new ListNode(30);
        ListNode f4 = new ListNode(40);
        ListNode f5 = new ListNode(50);

        f1.next = f2;
        f2.next = f3;
        f3.next = f4;
        f4.next = f5;

        ListNode head = f1;
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
     
        printList(prev);
    }
}