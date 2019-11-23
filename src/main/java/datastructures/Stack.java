package datastructures;

public class Stack {
    int top;
    int MAX_SIZE = 1000;
    int a[] = new int[MAX_SIZE];

    boolean isEmpty() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    }

    boolean push(int x) {
        if (top >= MAX_SIZE - 1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " element pushed to Stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            System.out.println(x + " element popped");
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            System.out.println(x + " element peeked");
            return x;
        }
    }
}
