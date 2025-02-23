package Queue;

public class RunOwnQueueUsingCircularArray {
    public static void main(String[] args) {
        try {
            OwnQueueUsingCircularArray queue1 = new OwnQueueUsingCircularArray(1);
            queue1.display();
            queue1.push(1);
            queue1.display();
            queue1.push(2);
            queue1.display();
            queue1.push(3);
            queue1.display();
            queue1.pop();
            queue1.display();
            queue1.push(4);
            queue1.push(5);
            queue1.push(6);
            queue1.display();
            queue1.push(7);
            queue1.push(8);
            queue1.pop();
            queue1.push(9);
            queue1.push(10);
            queue1.pop();
            queue1.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
