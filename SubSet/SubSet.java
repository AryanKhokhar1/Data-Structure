import java.util.ArrayList;

public class SubSet {

    static void subset(ArrayList<Integer> p, ArrayList<Integer> un){
        if(un.isEmpty()){
            System.out.println(p.toString());
            return;
        }
        Integer i = un.getFirst();
        ArrayList<Integer> remaining = new ArrayList<>(un);
        remaining.removeFirst();
        subset(p, remaining );
        ArrayList<Integer> pwithCurrent = new ArrayList<>(p);
        pwithCurrent.add(i);
        subset(pwithCurrent, remaining);

    }
    static void subsetwithstring(String p, String un){
        if(un.isEmpty()){
            System.out.println(p);
            return;
        }
        subsetwithstring(p+un.charAt(0), un.substring(1));
        subsetwithstring(p, un.substring(1));

    }
    static ArrayList<String> ArrSubset(String pstr, String unstr){
        if(unstr.isEmpty()){
            ArrayList<String> list  = new ArrayList<>();
            list.add(pstr);
            return list;
        }

        ArrayList<String> left = ArrSubset(pstr+ unstr.charAt(0),unstr.substring(1));
        ArrayList<String> right = ArrSubset(pstr,unstr.substring(1));

        left.addAll(right);
        return left;
    }
    public static void main(String[] args) {
//        ArrayList<Integer> p = new ArrayList<>();
//        ArrayList<Integer> un = new ArrayList<>();
//        un.add(1);
//        un.add(2);
//        un.add(3);
//        subset(p,un);
        ArrayList<String> ans = ArrSubset("", "abc");
        System.out.println(ans.toString());
    }
}
