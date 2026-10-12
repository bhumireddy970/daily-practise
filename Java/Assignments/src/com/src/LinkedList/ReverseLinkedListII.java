package com.src.LinkedList;

public class ReverseLinkedListII {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right ) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode beforeStart=dummy;

        for(int i=1;i<left;i++)
            beforeStart=beforeStart.next;

        ListNode start=beforeStart.next;

        ListNode end=start;
        for(int i=0;i<right-left;i++)
            end=end.next;
        ListNode afterEnd=end.next;
        end.next=null;

        ListNode reverseHead=reverseListWithoutUsingStack(start);

        beforeStart.next=reverseHead;
        start.next=afterEnd;
        return dummy.next;


    }
    public static ListNode reverseListWithoutUsingStack(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        PrintLinkedList.printList(reverseBetween(head,2,4));
    }
}
