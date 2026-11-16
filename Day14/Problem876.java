package Day14;

public class Problem876 {
    
    // ListNode definition
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // Method to find the middle node
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Returns the middle ListNode object
        return slow;
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
        
        // Call the method and store the result
        ListNode middle = middleNode(head);

        // Print the value of the middle node
    while (middle != null) {
            System.out.print( middle.val+" ");
            middle=middle.next;
        }
    }
}