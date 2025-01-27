public class MyCircularLinkedList {

    private Node head;
    private Node tail;
    class Node{
        int value = 1;
        Node next;
        Node prev;

        Node(){
//            this.value = null;
            this.next = null;
            this.prev = null;
        }
        Node(int value){
            this.value = value;
            this.next = null;
            this.prev = null;
        }
        Node(int value, Node next){
            this.value = value;
            this.next = next;
            this.prev = null;
        }
        Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }

    public void insertAtFirst(int value){
        if(this.head == null){
            Node  node = new Node(value);
            this.head = node;
            this.tail = node;
        }else{
            Node node = new Node(value);
            node.next = this.head;
            this.tail.next = node;
            this.head = node;
        }
    }

    public void insertAtBack(int value){
        if(this.head == null){
            Node node = new Node(value);
            this.head = node;
            this.tail = node;
        }else{
            Node node = new Node(value);
            this.tail.next = node;
            this.tail = node;
            this.tail.next = this.head;
        }
    }

    public void deleteFirst(){
        if(this.head.next == this.head){
            this.head = null;
            this.tail = null;
        }else{
            this.head = this.head.next;
            this.tail.next = this.head;
        }
    }

    public void deleteLast(){
        if(this.head.next == this.head){
            this.head = null;
            this.tail = null;
        }else{
            Node temp = this.head;
            while(temp.next != this.tail){
                temp = temp.next;
            }
            this.tail = temp;
            this.tail.next = head;
        }
    }

    public void deleteAt(int position){
        if (position == 1){
            this.deleteFirst();
        }else{
            Node temp = this.head;
            for(int i = 2; i<position; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == this.tail){
                this.tail = temp;
            }
        }
    }

    public void insertAt(int position, int value){
        if(position == 1){
            this.insertAtFirst(value);
        }else{
            Node temp = head;
            for(int i = 2; i<position; i++){
                temp = temp.next;
            }
            Node node = new Node(value);
            if(temp == this.tail){
                temp.next = node;
                this.tail = node;
                this.tail.next = head;
            }else{
                node.next = temp.next;
                temp.next = node;
            }
        }
    }

    public void display(){
        Node node = this.head;
        while(node != this.tail){
            System.out.print(node.value+" -> ");
            node = node.next;
        }
        System.out.print(node.value+" -> HEAD");
        System.out.println();
    }
}
