package datastructures;

import java.awt.SystemTray;
import java.util.HashSet;
import java.util.Set;

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

        /*Array numbers = new Array(3);

        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.removeAt(1);
        numbers.print();*/

        /*LinkedList2 linkedList2 = new LinkedList2();
        linkedList2.addLast(10);
        linkedList2.addLast(20);
        linkedList2.addLast(30);

        linkedList2.addFirst(40);
        linkedList2.indexOf(30);

        System.out.println(linkedList2.contains(1));
        linkedList2.deleteFirst();
        linkedList2.deleteLast();*/

        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(3);
        treeNode.right = new TreeNode(6);
        treeNode.left.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(4);
        treeNode.right.right = new TreeNode(7);

        System.out.println(treeNode.findTarget(treeNode, 9));
    }
}


