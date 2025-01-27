public class DLLMain {

    public static void main(String[] args) {
        MyDoubleLinkedList list = new MyDoubleLinkedList();
        list.addAtFirst(5);
        list.addAtFirst(6);
        list.addAtFirst(7);
        list.addAtLast(4);
        list.addAtLast(3);
        list.display();
        System.out.println("Size of the LinkedList: "+list.size);
        list.displayFromBack();
        list.insert(2,78);
        list.display();
        list.deleteFirst();
        list.deleteLast();
        list.display();
        list.deleteAt(1);
        list.display();
//        System.out.println(list.head.prev == null);
    }
}
