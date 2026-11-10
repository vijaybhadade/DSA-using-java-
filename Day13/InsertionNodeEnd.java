package Day13;



public class InsertionNodeEnd {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        

        first.next = second;
        second.next = third;
        ListNode temp = first;
        ListNode head = temp;
        ListNode newValue = new ListNode(40);

        ListNode current = head;
        while (current.next != null) {
            System.out.println(current.val);
            current = current.next;
        }
        current.next = newValue;

    }
}
