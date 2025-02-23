package Stack;

public class RunOwnStack {
    public static void main(String[] args) {
        OwnStack stack1 = new OwnStack(4);
        System.out.println(stack1.push(4));
        System.out.println(stack1.peek());
        System.out.println(stack1.push(6));
        System.out.println(stack1.push(7));
        System.out.println(stack1.peek());
        System.out.println(stack1.push(9));
        System.out.println(stack1.push(1));
        System.out.println(stack1.push(2));
        stack1.display();
        System.out.println(stack1.peek());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        stack1.display();
    }
}
