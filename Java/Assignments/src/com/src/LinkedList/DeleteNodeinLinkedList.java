package com.src.LinkedList;

public class DeleteNodeinLinkedList {
    static ListNode head=new ListNode(1);

    public static void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }

    public static void main(String[] args) {
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        deleteNode(head.next.next);
        PrintLinkedList.printList(head);
    }
}
