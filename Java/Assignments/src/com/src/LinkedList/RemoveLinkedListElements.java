package com.src.LinkedList;

public class RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp=dummy;
        while(temp.next!=null)
        {
            if(temp.next.val==val)
            {
                temp.next=temp.next.next;
            }
            else
                temp=temp.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next=new ListNode(1);
        head.next.next=new ListNode(1);
        head.next.next.next=new ListNode(1);
        head.next.next.next.next=new ListNode(1);
        head.next.next.next.next.next=new ListNode(1);
        head.next.next.next.next.next.next=new ListNode(1);

        PrintLinkedList.printList(head);
        System.out.println();
        PrintLinkedList.printList(removeElements(head,1));

    }
}
