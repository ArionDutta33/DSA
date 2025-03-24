package LinkedList;

import java.util.HashSet;

import revsision.nextPermutation;

class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println(head.value);
    }

    public void getTail() {
        System.out.println(tail.value);
    }

    public void getLength() {
        System.out.println(length);
    }

    // add at last
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {

            tail.next = newNode;
            tail = newNode;
        }
        length++;

    }

    // remove last
    public void removeLast() {
        if (head == null) {
            return;
        }
        if (length == 1) {
            head = null;
            tail = null;
            return;
        }
        Node temp = head;
        Node pre = head;
        while (temp != null && temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        pre.next = null;
        length--;
    }

    // add first
    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public void removeFirst() {
        if (length == 1) {
            head = null;
            tail = null;
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
    }
}

public class Intro {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(2);
        HashSet<Integer>set=new HashSet<>();
        set.contains(o)
        list.addLast(20);
        System.out.println("check");
        // list.removeLast();
        // list.addFirst(1);
        list.removeFirst();
        list.printList();
    }
}