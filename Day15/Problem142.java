package Day15;

public class Problem142 {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Phase 1: Move slow by 1 and fast by 2 to detect a cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Phase 2: Reset slow to head and move both by 1 to find cycle entry
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        ListNode f1 = new ListNode(3);
        ListNode f2 = new ListNode(2);
        ListNode f3 = new ListNode(0);
        ListNode f4 = new ListNode(-4);

        f1.next = f2;
        f2.next = f3;
        f3.next = f4;
        f4.next = f2; // Creates a cycle back to node 2

        ListNode head = f1;
        ListNode result = detectCycle(head);

        if (result != null) {
            System.out.println("Cycle starts at node with value: " + result.val);
        } else {
            System.out.println("No cycle found.");
        }
    }
}