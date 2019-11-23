package datastructures;

public class Main {

    public static void main(String[] arg) {
        LinkedList linkedList = new LinkedList();

        linkedList = LinkedList.insert(linkedList, 1);
        linkedList = LinkedList.insert(linkedList, 2);
        linkedList = LinkedList.insert(linkedList, 3);
        linkedList = LinkedList.insert(linkedList, 4);
        linkedList = LinkedList.insert(linkedList, 5);

        linkedList.printList(linkedList);

        linkedList = LinkedList.deleteByKey(linkedList, 0);
        linkedList = LinkedList.deleteByKey(linkedList, 1);

        linkedList.printList(linkedList);
    }
}


