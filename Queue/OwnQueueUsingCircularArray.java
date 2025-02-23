package Queue;

public class OwnQueueUsingCircularArray extends OwnQueue {
    private int start = 0;
    private int end = 0;
    // Both start and end are inclusive
    // Implementing Queue using circular Array
    OwnQueueUsingCircularArray(){
        super();
    }
    OwnQueueUsingCircularArray(int size) throws Exception{
        super(size);
    }
    private void isFull(){
        if((end+1)%this.queue.length == start){
            int[] nQueue = new int[2*(this.queue.length)];
            int s;
            if((end-start) >= 0){
                s = end - start;
            }else{
                s = this.queue.length - Math.abs(end-start);
            }
            for(int i = 0; i<s; i++){
                nQueue[i] = this.queue[(start+i)%this.queue.length];
            }
            queue = nQueue;
            start = 0;
            end = s;
            // System.out.println(Arrays.toString(queue));
        }
    }
    private boolean isEmpty() throws Exception{
        return start == end;
    }
    public void push(int element){
        isFull();
        this.queue[end] = element;
        end = (end+1)% this.queue.length;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            System.out.println("Queue is Empty can't pop");
            return -1;
        }
        int val = this.queue[start];
        start = (start+1)%this.queue.length;
        return val;
    }
    public void display(){
        int s;
        if(end>=start){
            s = end -start;
        }else{
            s = this.queue.length - Math.abs(end-start);
        }
        System.out.print("Queue: [");
        for(int i = 0; i<s; i++){
            System.out.print(this.queue[(start+i)%this.queue.length]+", ");
        }
        System.out.println("]");
    }
}
