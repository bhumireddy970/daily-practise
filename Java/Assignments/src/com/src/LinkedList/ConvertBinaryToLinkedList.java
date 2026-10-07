package com.src.LinkedList;

import java.util.LinkedList;
import java.util.List;


public class ConvertBinaryToLinkedList {
    public static int getDecimalValuefromLL(List<Integer> head) {
        int len=head.size();
        int result=0;
        for(int i=0;i<head.size();i++){
            result+= (int) (Math.pow(2,len-i-1)*head.get(i));
        }

        return result;
    }

    public static int getDecimalValue(ListNode head) {
        List<Integer> ll=new LinkedList<>();
        while(head!=null)
        {
            ll.add(head.val);
            head=head.next;
        }

        return getDecimalValuefromLL(ll);
    }


    public static void main(String[] args) {
        List<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(1);
        ll.add(0);
        ll.add(1);
        System.out.println(getDecimalValuefromLL(ll));

        ListNode head=new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(0);


        System.out.println(getDecimalValue(head));
    }
}
