package Stack;

import java.util.Arrays;

public class OwnDynamicStack {
    private int[] stack;
    private static final int DEFAULT__SIZE = 10;
    private int ptr = -1;
    OwnDynamicStack(){
        this.stack = new int[DEFAULT__SIZE];
    }

    OwnDynamicStack(int size) throws Exception {
        if( size < 1){
            throw new Exception("You can't create Stack less than of 1 size");
        }else{
            this.stack = new int[size];
        }
    }
    private boolean  isFull(){
        return this.ptr == this.stack.length-1;
    }
    private boolean isEmpty() throws Exception{
        if(ptr == -1){
            throw new Exception("Stack is Empty");
        }
        return true;
    }
    public void push(int element){
        if(isFull()){
            increaseStackLength();
        }
        this.stack[++ptr] = element;
    }
    public int pop() throws Exception{
        isEmpty();
        int val = this.stack[ptr];
        ptr--;
        return val;
    }
    public int peek(){
        return this.stack[ptr];
    }
    private void increaseStackLength(){
        int[] nStack = new int[2*(ptr+1)];
        for(int i = 0; i<= ptr; i++){
            nStack[i] = this.stack[i];
        }
        this.stack = nStack;
        System.out.println(Arrays.toString(this.stack));
    }
    public void display() throws Exception{
        isEmpty();
        System.out.print("Stack: [ ");
        for(int i = 0; i<ptr; i++){
            System.out.print(this.stack[i]+", ");
        }
        System.out.print(this.stack[ptr]);
        System.out.print(" ]");
        System.out.println();
    }
}
