package datastructures;

public class Main {

    public static void main(String[] arg) {
        /*LinkedList linkedList = new LinkedList();

        linkedList = LinkedList.insert(linkedList, 1);
        linkedList = LinkedList.insert(linkedList, 2);
        linkedList = LinkedList.insert(linkedList, 3);
        linkedList = LinkedList.insert(linkedList, 4);
        linkedList = LinkedList.insert(linkedList, 5);

        linkedList.printList(linkedList);

        linkedList = LinkedList.deleteByKey(linkedList, 0);
        linkedList = LinkedList.deleteByKey(linkedList, 1);

        linkedList.printList(linkedList);

        linkedList = LinkedList.deleteAtPosition(linkedList, 1);

        linkedList.printList(linkedList);*/

        /*Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.isEmpty();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();*/

        /*StackAsLinkedList stack = new StackAsLinkedList();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.isEmpty();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();*/

        /*Queue queue = new Queue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.isFull(queue);

        queue.dequeue();
        queue.dequeue();*/

        /*HashMap hashMap = new HashMap(10);

        hashMap.put(1, "Steve");
        hashMap.put(2, "Bill");
        hashMap.put(2, "Jack");
        hashMap.put(3, "Elon");
        hashMap.put(4, "Jeff");
        hashMap.put(5, "Mark");
        hashMap.put(1, "Wozniak");

        hashMap.get(2);
        hashMap.get(1);*/

        Array array = new Array(3);

        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.removeAt(1);
        array.print();

    }
}


