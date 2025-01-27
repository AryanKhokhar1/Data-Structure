public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(45);
        list.addFirst(8);
        list.addFirst(3);
        list.addLast(56);
        list.display();
        System.out.println("Size of the LinkedList: "+list.size());
        list.removeFirst();
        list.display();








































































































        System.out.println("Value at index:"+1+" in LinkedList: "+list.valueAt(1));
        list.insert(1,87);
//        list.removeLast();
        list.display();
        System.out.println(list.get(3));
    }
}
