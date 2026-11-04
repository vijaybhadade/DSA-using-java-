package Day11;
 class ListNode{
    int val;
    ListNode next;

    //constructor
    ListNode(int val)
    {
        this.val=val;
    }
}

public class Main {
    public static void main(String[] args) {
        ListNode first= new ListNode(10);
        ListNode second= new ListNode(20);
        ListNode third= new ListNode(30);

        first.next=second;
        second.next=third;

        ListNode head=first;

        System.out.println(head.next.next.val);
    }
}
