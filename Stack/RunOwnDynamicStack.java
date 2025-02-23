package Stack;

public class RunOwnDynamicStack {
    public static void main(String[] args) {
        
        try {
            OwnDynamicStack stack1 = new OwnDynamicStack(1);
            stack1.push(1);
            stack1.push(2);
            stack1.push(3);
            stack1.push(4);
            stack1.push(5);
            stack1.display();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
