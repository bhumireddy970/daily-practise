package com.src.LinkedList;


import java.util.Stack;

public class ReverseLinkedList {
    public static ListNode reverseListUsingStack(ListNode head) {
        if (head == null) return null;
        Stack<Integer> s=new Stack<>();

        while(head!=null)
        {
            s.push(head.val);
            head=head.next;
        }

        ListNode newHead=new ListNode(s.pop());
        ListNode current = newHead;
        while(!s.isEmpty())
        {
            current.next=new ListNode(s.pop());
            current = current.next;
        }
        return newHead;
    }

    public static ListNode reverseListWithoutUsingStack(ListNode head) {
        if (head == null) return null;
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

        ListNode head2=reverseListUsingStack(head);
        PrintLinkedList.printList(head2);
        System.out.println();
        ListNode head3=reverseListWithoutUsingStack(head);
        PrintLinkedList.printList(head3);
    }
}
