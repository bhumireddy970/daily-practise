package com.src;

import java.util.*;
class Node{
    int key;
    int val;
    Node next;
    Node prev;
    Node(int key,int val)
    {
        this.key=key;
        this.val=val;
        this.next=null;
        this.prev=null;
    }
}
class LRUCache {
    Map<Integer,Node> cache;
    int capacity;
    Node oldest;
    Node latest;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.cache=new HashMap<>();
        this.oldest=new Node(0,0);
        this.latest=new Node(0,0);
        oldest.next=this.latest;
        latest.prev=this.oldest;
    }

    public int get(int key) {
        if(cache.containsKey(key))
        {
            Node node=cache.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }

    public void remove(Node node)
    {
        Node prev=node.prev;
        Node next=node.next;
        prev.next=next;
        next.prev=prev;
    }

    public void insert(Node node)
    {
        Node prev=latest.prev;
        prev.next=latest.prev=node;
        node.prev=prev;
        node.next=latest;
    }

    public void put(int key, int value) {
        if(cache.containsKey(key))
            remove(cache.get(key));
        Node newNode=new Node(key,value);
        insert(newNode);
        cache.put(key,newNode);

        if(cache.size()>capacity)
        {
            Node lru=oldest.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }

    public static void main(String[] args) {
        LRUCache obj = new LRUCache(2);
        obj.put(2,1);
        obj.put(2,2 );
        int param_1 = obj.get(2);

        System.out.println(param_1);
    }
}


