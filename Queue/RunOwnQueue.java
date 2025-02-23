package Queue;

public class RunOwnQueue {
    public static void main(String[] args) {
        try{
            OwnQueue queue1 = new OwnQueue();
            queue1.push(1);
            queue1.display();
            queue1.push(2);
            queue1.push(3);
            queue1.pop();
            queue1.push(4);
            queue1.push(5);
            queue1.display();
            queue1.pop();
            queue1.push(6);
            queue1.push(7);
            queue1.display();
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
