package Stack;

public class OwnStack {
    private int[] stack;
    private int DEFAULT__SIZE = 10;

    private int ptr = -1;
    OwnStack(){
        this.stack = new int[DEFAULT__SIZE];
    }
    OwnStack(int size){
        this.stack = new int[size];
    }

    public boolean  push(int element){
        if( isFull()){
            return false;
        }
        this.stack[++ptr] = element;
        return true;
    }
    public int pop(){
        if( isEmpty()){
            return -1;
        }
        int val = this.stack[ptr];
        ptr--;
        return val;
    }
    public int peek(){
        return this.stack[ptr];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("This is an Empty Stack");
            return;
        }
        System.out.print("Stack: [ ");
        for(int i = 0; i<this.ptr; i++){
            System.out.print(this.stack[i]+", ");
        }
        System.out.print(this.stack[ptr]);
        System.out.print(" ]");
        System.out.println();
    }
    private boolean isFull(){
        return ptr == this.stack.length -1;
    }
    private boolean isEmpty(){
        return ptr == -1;
    }
}
