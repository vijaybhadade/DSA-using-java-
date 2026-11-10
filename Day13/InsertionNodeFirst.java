package Day13;

public class InsertionNodeFirst {
    private static  class ListNode{
      
        int val;
        ListNode next;

        ListNode(int val)
        {
            this.val=val;
        }
    }
    public static void main(String[] args) {
        
        ListNode first= new ListNode(10);
        ListNode second= new ListNode(20);
        ListNode three= new ListNode(30);

        ListNode newNode= new ListNode(5);
        newNode.next=first;
        first.next= second;
        second.next=three;


        ListNode temp=newNode;

       while(temp!=null)
       {
        System.out.println(temp.val);
        temp=temp.next;
       }

       
    }
}
