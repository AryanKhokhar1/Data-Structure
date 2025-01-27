

// When using this in MyLinkedList we are talking about whole LinkedList
// When we are using Node we are using Node object

class MyLinkedListException extends Exception{

    MyLinkedListException(String str){
        super(str);
    }
}

public class MyLinkedList {


    private Node head;
    private Node tail;
    private int size;

    MyLinkedList(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;
        public Node(int val){
            this.value = val;
        }
        public Node(int val, Node next){
            this.value = val;
            this.next = next;
        }
    }

    public int size(){
        return this.size;
    }
    public void addLast(int value){
        if(this.size == 0){
            this.addFirst(value);
            return;
        }
        Node node = new Node(value);
        this.tail.next = node;
        node.next = null;
        this.tail = node;
        size++;
        return;
    }

    public void addFirst(int value) {
        if (this.size == 0) {
            Node node = new Node(value);
            this.head = node;
            this.tail = this.head;
            size++;
            return;
        }

        Node node = new Node(value, this.head);
        this.head = node;
        size++;
        return;
    }

    public void display(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.print("End");
        System.out.println();
    }

    public void removeFirst(){
        this.head = this.head.next;
        size--;
    }
    public int valueAt(int index){
        if(index<this.size && index >= 0){

            // It have only declaration so it hold only
            Node temp;
            temp = this.head;
            for(int i = 0; i!=index; i++){
                temp = temp.next;
            }
            return temp.value;
        }else{
            return -1;
        }

    }
    public void removeLast(){
        if(this.size>1){
            Node temp;
            temp = head;
            while(temp.next != this.tail){
                temp = temp.next;
            }
            this.tail = temp;
            this.tail.next = null;
        }else if(this.size == 1){
            this.head = null;
            this.tail = null;
        }
    }
    public void insert(int index, int value){
        if(index < this.size && index>= 0){

            Node temp = this.head;
            for(int i = 1; i< index; i++){
                temp = temp.next;
            }
            Node newNode = new Node(value,temp.next);
            temp.next = newNode;
            size++;
        }
    }
    public int get(int position){
        Node node = this.head;
        for(int i = 1;i<position; i++){
            node = node.next;
        }
        return node.value;
    }
}
