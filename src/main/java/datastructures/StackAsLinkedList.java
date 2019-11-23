package datastructures;

public class StackAsLinkedList {
    StackNode root;

    class StackNode {
        StackNode next;
        int data;

        public StackNode(int d) {
            this.data = d;
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);

        if (root == null) {
            root = newNode;
        } else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }

    public int pop() {
        int popped = Integer.MIN_VALUE;

        if (root == null) {
            System.out.println("Stack is empty");
            return popped;
        } else {
            popped = root.data;
            root = root.next;
            System.out.println(popped + " is popped");
        }
        return popped;
    }

    public int peek() {
        if (root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        } else {
            System.out.println(root.data + " is peeked");
            return root.data;
        }
    }

}
