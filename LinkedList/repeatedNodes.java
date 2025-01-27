import java.util.LinkedList;

public class repeatedNodes {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        LinkedList<Integer> answer = new LinkedList<>();
        if(!linkedList.get(0).equals(linkedList.get(1))){
            answer.add(linkedList.get(0));
        }
        for(int i = 1; i<linkedList.size(); i++){
            if(!linkedList.get(i-1).equals(linkedList.get(i))){
                answer.add(linkedList.get(i));
            }
        }
        System.out.println(answer);
    }
}
