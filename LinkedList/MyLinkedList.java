
public class MyLinkedList {


    class Node{
        int val;
        Node next;

        Node(){
            this.next = null;
        }
        Node(int val){
            this.val = val;
            this.next = null;
        }
        Node (int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
    Node head;
    Node tail;
    int size;
    MyLinkedList() {
        this.size = 0;
    }

    void addLast(int val){
        if(this.size == 0){
            firstAdd(val);
        }else{
            Node node = new Node(val);
            tail.next = node;
            tail = tail.next;
            this.size++;
        }
    }
    void firstAdd(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(this.size == 0){
            this.head = node;
            this.tail = node;
        }
        this.size++;
    }

    void display(){
        Node temp = head;
        while (temp != null) { 
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("");
    }
    
    boolean removebyPosition(int position){
        if(position > size){
            return false;
        }else{
            Node temp = head;
            if(position == 1){
                this.head = this.head.next;
                this.size--;
                return true;
            }else{
                for(int i = 2; i<=position; i++){
                    if(i == position){
                        temp.next = temp.next.next;
                        this.size--;
                        return true;
                    }
                    temp = temp.next;
                }
                return false;
            }
        }
    }
    boolean removebyValue(int val){
        Node temp = head;
        if(this.head.val == val){
            this.head = this.head.next;
            this.size--;
            return true;
        }
        while(temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
                this.size--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
