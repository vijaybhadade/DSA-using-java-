package Day13;



public class SearchNode {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        int target = 30;
        boolean found = false;

        ListNode first = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode three = new ListNode(30);
        ListNode four = new ListNode(40);
        ListNode five = new ListNode(50);

        first.next = second;
        second.next = three;
        three.next = four;
        four.next = five;

        ListNode temp = first;

        while (temp != null) {
            if (temp.val == target) {
                found = true;
                break;
            }
            temp = temp.next;
        }
        System.out.println(found);
    }
}
