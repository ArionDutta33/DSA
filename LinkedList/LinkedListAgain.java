package LinkedList;

class LL {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int data;
        Node next;
        int length;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public LL(int data) {
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // *add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    // *remove last */
    public void removeLast() {
        Node temp = head;
        Node pre = head;
        if (head == null) {
            return;
        }
        if (length == 1) {
            head = null;
            tail = null;
            return;
        }
        while (temp != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        pre.next = null;
        length--;
    }
}

public class LinkedListAgain {
    public static void main(String[] args) {
        LL list = new LL(4);
        // list.printList();
        list.addLast(10);
        list.removeLast();
        list.printList();
    }

}
