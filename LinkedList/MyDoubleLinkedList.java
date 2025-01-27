public class MyDoubleLinkedList {

    public int size;
    public Node head;
    public Node tail;


    MyDoubleLinkedList(){
        this.size = 0;
    }


    class Node{

        private int val;
        private Node next;
        private Node prev;

        Node(){}
        Node(int value){this.val = value;}
        Node(int value, Node next){
            this.val = value;
            this.next = next;
        }
        Node(int value, Node next, Node prev){
            this.val = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void addAtFirst(int value){
        if(this.head == null){
            Node node = new Node(value);
            this.head = node;
            this.tail = node;
            this.size++;
        }else{
            Node node = new Node(value,this.head);
            this.head.prev = node;
            this.head = node;
            this.size++;
        }
    }

    public void addAtLast(int value){
        if(this.head == null){
            Node node = new Node(value);
            this.head = node;
            this.tail = node;
            this.size++;
        }else{
            Node node = new Node(value);
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
            this.size++;
        }
    }

    public void display(){
        Node node = this.head;
        while(node != null){
            System.out.print(node.val+" -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public void displayFromBack(){
        Node node = this.tail;
        System.out.print("END");
        while(node != null){
            System.out.print(" <- "+node.val);
            node = node.prev;
        }
        System.out.println();
    }
    public boolean insert(int index, int value){
        if(this.size>index){
            if(index == 0){
                this.addAtFirst(value);
            }else if(index == this.size-1){
                this.addAtLast(value);
            }else{
                Node node = this.head;
                Node n1 = new Node(value);
                for(int i = 1; i< index; i++){
                    node = node.next;
                }
                Node nextNode = node.next;
                n1.prev = node;
                nextNode.prev = n1;
                node.next = n1;
                n1.next = nextNode;
            }
            size++;
            return true;
        }else {
            return false;
        }
    }


    public boolean deleteFirst(){
        if(this.head == null){
            return false;
        }else{
            this.head = this.head.next;
            this.head.prev = null;
            size--;
            return true;
        }
    }
    public boolean deleteLast(){
        if(this.tail == null){
            return false;
        }else{
            this.tail = this.tail.prev;
            this.tail.next = null;
            size--;
            return true;
        }
    }
    public boolean deleteAt(int index){
        if(index == 0 && this.size>0){
            return deleteFirst();
        }else if(index == this.size -1 && this.size>0){
            return deleteLast();
        }else if(index>this.size -1 || this.size <= 0){
            return false;
        }else{
            Node node = head;
            for(int i = 1; i<index; i++){
                node = node.next;
            }
            Node nextElement = node.next.next;
            node.next = nextElement;
            nextElement.prev.prev = node;
            return true;
        }
    }
}
