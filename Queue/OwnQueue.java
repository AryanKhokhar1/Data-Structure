package Queue;

import static Queue.QueueEception.CannotIntialize;
import static Queue.QueueEception.EmptyQueue;

class QueueEception extends Exception{
    static void CannotIntialize() throws Exception{
        throw new Exception("Cannot Intialize with less than 1");
    }
    static void EmptyQueue() throws Exception{
        throw new Exception("Can't pop element Queue is already Empty");
    }
}
public class OwnQueue {
    protected  int[] queue;
    private static final int DEFAULT__SIZE = 10;
    private int ptr = -1;
    OwnQueue(){
        this.queue = new int[DEFAULT__SIZE];
    }
    OwnQueue(int size) throws Exception{
        if(size < 1){
            CannotIntialize();
        }else{
            this.queue = new int[size];
        }
    }
    public void push(int element){
        isFull();
        this.queue[++ptr] = element;
    }
    public int pop() throws  Exception{
        isEmpty();
        int val = this.queue[0];
        for(int i = 0; i<ptr; i++){
            this.queue[i] = this.queue[i+1];
        }
        ptr--;
        return val;
    }
    public void display(){
        if(ptr == -1){
            System.out.println("Queue is Empty");
        }else{
            System.out.print("Queue: [");
            for(int i = 0; i< ptr; i++){
                System.out.print(this.queue[i]+", ");
            }
            System.out.print(this.queue[ptr]);
            System.out.print("]");
            System.out.println();
        }
    }
    private void isFull(){
        if(ptr == this.queue.length-1){
            int[] nQueue = new int[2*(ptr+1)];

            for(int i = 0; i<=ptr; i++){
                nQueue[i] = this.queue[i];
            }
            queue = nQueue;
        }
    }
    private boolean isEmpty() throws Exception{
        if(ptr == -1){
            EmptyQueue();
        }
        return false;
    }
}
