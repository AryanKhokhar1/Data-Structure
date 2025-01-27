class Main{
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.addLast(7);
        obj.firstAdd(6);
        obj.addLast(8);
        obj.display();
        obj.addLast(9);
        obj.display();
        obj.removebyValue(9);
        obj.display();
        obj.removebyPosition(1);
        obj.removebyPosition(2);
        obj.display();
    }
}