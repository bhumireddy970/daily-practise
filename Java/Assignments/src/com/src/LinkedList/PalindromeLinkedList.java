package com.src.LinkedList;

public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        ListNode mid=middleNode(head);
        ListNode second=reverseListWithoutUsingStack(mid);
        while(second!=null){
            if(head.val!=second.val){
                return false;
            }
            head=head.next;
            second=second.next;
        }
        return true;
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

    public static ListNode middleNode(ListNode head) {
        if(head==null) return head;
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);


        System.out.println(isPalindrome(head));
    }
}
