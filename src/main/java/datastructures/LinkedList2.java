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

    public boolean contains(int item) {
        while (first != null) {
            if (first.value == item) {
                return true;
            }

            first = first.next;
        }

        return false;
    }

    public int indexOf(int item) {
        int count = 0;
        Node currentItem = first;
        while (currentItem != null) {
            if (currentItem.value == item) {
                return count;
            }

            currentItem = currentItem.next;
            count++;
        }

        return -1;
    }
}
