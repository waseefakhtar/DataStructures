package datastructures;

import java.util.NoSuchElementException;

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

    public void deleteFirst() {
        if (first == null) {
            throw new NoSuchElementException();
        }

        // For a single item in the list.
        if (first == last) {
            first = null;
            last = null;
            return;
        }

        Node second = first.next;
        first.next = null;
        first = second;
    }

    public void deleteLast() {
        if (first == null) {
            throw new NoSuchElementException();
        }

        // For a single item in the list.
        if (first == last) {
            first = null;
            last = null;
            return;
        }

        Node current = first;
        while (current != null) {
            if (current.next == last) {
                break;
            }
            current = current.next;
        }

        last = current;
        current.next = null;
    }

    public boolean contains(int item) {
        Node currentItem = first;
        while (currentItem != null) {
            if (currentItem.value == item) {
                return true;
            }

            currentItem = currentItem.next;
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
