package com.src.LinkedList;

public class PrintLinkedList {
    public static void printList(ListNode head) {
        while(head!=null)
        {
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
}
