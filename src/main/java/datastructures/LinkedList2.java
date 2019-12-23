package datastructures;

public class LinkedList2 {
    private Node first;
    private Node last;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    // addFirst
    public void addFirst(int value) {

    }

    // addLast
    public void addLast(int item) {
        Node node = new Node(item);

        if (this.first == null) {
            this.first = node;
            this.last = node;
        } else {
            this.last.next = node;
            this.last = node;
        }
    }

    // deleteFirst
    // deleteLast
    // contains
    // indexOf
}
