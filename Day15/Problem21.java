package Day15;

class Problem21 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode mergeListNode(ListNode l1, ListNode l2) {
        // create third dummy listNode for merge
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
              tail = tail.next;
        
        }
        if(l1 != null)
        {
            tail.next=l1;
        }

        if(l2!=null)
        {
            tail.next=l2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        // create first listnode
        ListNode f1 = new ListNode(1);
        ListNode f2 = new ListNode(2);
        ListNode f3 = new ListNode(6);
        ListNode f4 = new ListNode(8);

        f1.next = f2;
        f2.next = f3;
        f3.next = f4;

        // create second listNode
        ListNode s1 = new ListNode(3);
        ListNode s2 = new ListNode(2);
        ListNode s3 = new ListNode(5);
        ListNode s4 = new ListNode(7);

        s1.next = s2;
        s2.next = s3;
        s3.next = s4;

        ListNode l1 = f1;
        ListNode l2 = s1;

        ListNode mergeList = mergeListNode(l1, l2);
        while(mergeList!=null)
        {
            System.out.print(mergeList.val+" ");
            mergeList=mergeList.next;
        }
    }
}
