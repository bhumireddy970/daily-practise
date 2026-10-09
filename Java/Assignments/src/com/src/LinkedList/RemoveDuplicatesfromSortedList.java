package com.src.LinkedList;

public class RemoveDuplicatesfromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode temp=head;
        while(temp.next!=null)
        {
            if(temp.next.val==temp.val)
                temp.next=temp.next.next;
            else
                temp=temp.next;
        }
        return head;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(5);

        PrintLinkedList.printList(deleteDuplicates(head));
    }
}
