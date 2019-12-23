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

    public void addFirst(int item) {
        Node node = new Node(item);

        if (this.first == null) {
            this.first = node;
            this.last = node;
        } else {
            node.next = first;
            this.first = node;
        }
    }

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

    public int indexOf(int item) {
        int count = 0;

        while (first != null) {
            if (first.value == item) {
                System.out.println(count);
                return count;
            }

            first = first.next;
            count++;
        }

        System.out.println(-1);
        return -1;
    }
}
