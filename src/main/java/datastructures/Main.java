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

        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.isEmpty();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();
    }
}


