package Day14;

public class Problem141 {
    private static class ListNode{
        @SuppressWarnings("unused")
        int val;
        ListNode next;

        ListNode(int val)
        {
            this.val=val;
        }
    }
    public static  boolean hasCycle(ListNode head)
    {
        ListNode  slow=head;
        ListNode fast=head;
        while(fast != null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode f1=new ListNode(3);
        ListNode f2=new ListNode(2);  
        ListNode f3=new ListNode(0);
        ListNode f4=new ListNode(-4);
        

        f1.next=f2;
        f2.next=f3;
        f3.next=f4;
        

        ListNode head=f1;

        System.out.println(hasCycle(head));

    }
}
