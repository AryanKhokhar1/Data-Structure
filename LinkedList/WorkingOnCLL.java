public class WorkingOnCLL {

    public static void main(String[] args) {
        MyCircularLinkedList cll = new MyCircularLinkedList();
        cll.insertAtFirst(4);
        cll.insertAtFirst(5);
        cll.insertAtBack(3);
        cll.insertAtBack(2);
        cll.insertAtBack(1);
        cll.display();
        cll.deleteLast();
        cll.display();
        cll.deleteFirst();
        cll.display();
        cll.insertAt(1,5);
        cll.display();
        cll.insertAt(5, 1);
        cll.display();
        cll.insertAt(3, 43);
        cll.display();
        cll.deleteAt(3);
        cll.display();
    }
}
