import java.util.ArrayList;

public class check {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        arrayList.add(new ArrayList<Integer>(){{
            add(1);
            add(2);
        }});
        arrayList.add(new ArrayList<Integer>(){{
            add(3);
            add(4);
        }});
        arrayList.add(new ArrayList<Integer>(){{
            add(5);
            add(6);
        }});
        System.out.println(arrayList.get(0).get(0));
        for(int i){
            System.out.println(ele);
        }
    }
}
