package datastructures;

public class Queue {
    int front, rear, size, capacity;
    int[] array;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.front = 0;
        this.size = 0;
        this.rear = capacity - 1;
        this.array = new int[capacity];
    }

    public boolean isEmpty(Queue queue) {
        return queue.size == 0;
    }

    public boolean isFull(Queue queue) {
        return queue.size == queue.capacity;
    }

    void enqueue(int item) {
        if (isFull(this)) {
            System.out.println("Queue is full");
            return;
        }

        this.rear = (this.rear + 1) % this.capacity;
        array[this.rear] = item;
        this.size = size + 1;
        System.out.println(item + " is enqueued");
        return;
    }

    int dequeue() {
        if (isEmpty(this)) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }

        int item = this.array[this.front];
        this.front = (this.front + 1) % capacity;
        this.size = this.size - 1;
        System.out.println(item + " is dequeued");
        return item;
    }
}
