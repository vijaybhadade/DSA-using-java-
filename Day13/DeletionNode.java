package Day13;

public class DeletionNode {
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
        ListNode newValue = new ListNode(40);
        int target = 20;

        first.next = second;
        second.next = third;
        third.next = newValue;

        ListNode head = first;
        ListNode temp = head;

        while (temp != null && temp.next!=null) {
            if(temp.val==target)
            {
                temp.next=temp.next.next;
            }
            System.out.println(temp.val);
            temp = temp.next;
        }

    }
}
