package com.src.LinkedList;

public class IntersectionTwoLinkedLists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1 != temp2)
        {
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;

        }

        return temp1;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(4);
        head.next = new ListNode(1);
        head.next.next = new ListNode(8);


        ListNode head1=new ListNode(5);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(6);
        head1.next.next.next = new ListNode(8);
        head1.next.next.next.next = new ListNode(9);

        System.out.println(getIntersectionNode(head,head1));
    }

}
