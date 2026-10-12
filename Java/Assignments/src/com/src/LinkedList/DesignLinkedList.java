package com.src.LinkedList;

public class DesignLinkedList {
    private static class Node{
        int val;
        Node next;
        Node(int val)
        {this.val=val;}
    }

    private static Node head;
    private static int size;

    public DesignLinkedList() {
        this.head=null;
        this.size=0;
    }

    public static int get(int index) {
        if(index<0 || index>=size) return -1;
        Node temp=head;
        for(int i=0;i<index;i++)
            temp=temp.next;
        return temp.val;
    }

    public static void addAtHead(int val) {
        Node node=new Node(val);
        node.next=head;
        head=node;
        size++;
    }

    public static void addAtTail(int val) {
        Node node=new Node(val);
        if(head==null)
            head=node;
        else
        {
            Node temp=head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next=node;
        }
        size++;
    }

    public static void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index <= 0) {
            addAtHead(val);
            return;
        }
        Node node=new Node(val);
        if(head==null)
            head=node;
        Node curr=head;
        for(int i=0;i<index-1;i++)
        {
            curr=curr.next;
        }
        Node temp=curr.next;
        curr.next=node;
        node.next=temp;
        size++;

    }

    public static void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if(index==0)
            head=head.next;
        else{
            Node curr=head;
            for(int i=0;i<index-1;i++)
            {
                curr=curr.next;
            }
            curr.next=curr.next.next;
        }
        size--;
    }

    public static class PrintLinkedList {
        public static void printList(DesignLinkedList list) {
            DesignLinkedList.Node temp = list.head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DesignLinkedList list=new DesignLinkedList();
        addAtHead(1);
        addAtHead(2);
        addAtHead(3);
        PrintLinkedList.printList(list);
        System.out.println(get(2));
        addAtTail(4);
        PrintLinkedList.printList(list);
        addAtIndex(4,5);
        PrintLinkedList.printList(list);
        deleteAtIndex(2);
        PrintLinkedList.printList(list);
    }
}
