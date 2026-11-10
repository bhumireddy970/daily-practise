package com.src;

public class linkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void print(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
    }

    static int length(Node head)
    {
        int len=0;
        Node temp=head;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        return len;
    }

    static int search(Node head,int key)
    {
        int index=0;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==key)
                return index;
            index++;
            temp=temp.next;
        }
        return index;
    }

    static Node addFirst(Node head,int val)
    {
        Node newNode=new Node(val);
        if(head== null) return newNode;

        newNode.next=head;
        return newNode;
    }

    static Node addLast(Node head,int val)
    {
        Node newNode=new Node(val);
        if(head==null) return newNode;

        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }

    static Node reverse(Node head)
    {
        Node prev=null;
        Node curr=head;

        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }

    static Node middle(Node head)
    {
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }

    static int nthNodeFromEnd(Node head,int n)
    {
        if(n<0)
            return -1;
        Node slow=head;
        Node fast=head;
        int i=0;
        while(i<n)
        {
            if(fast==null)
                return -1;
            fast=fast.next;
            i++;
        }
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow.data;

    }


    public static void main(String[] args) {
        Node list = new Node(10);
        list.next= new Node(20);
        list.next.next= new Node(30);
        list.next.next.next= new Node(40);
        list=addFirst(list,1);
        list=addLast(list,50);
        list=addLast(list,60);
        print(list);
        list=reverse(list);
        print(list);

        System.out.println(middle(list).data);
        System.out.println(nthNodeFromEnd(list,2));

    }
}
