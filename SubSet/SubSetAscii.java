import java.util.ArrayList;

public class SubSetAscii {
    static ArrayList<String> subsetwithascii(String pstr, String un){
        if(un.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(pstr);
            return list;
        }
        char ch = un.charAt(0);

        ArrayList<String> left = subsetwithascii(pstr+ch, un.substring(1));
        ArrayList<String> middle = subsetwithascii(pstr+(ch+0), un.substring(1));
        ArrayList<String> right = subsetwithascii(pstr, un.substring(1));

        left.addAll(middle);
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        ArrayList<String> ans = subsetwithascii("","abc");
        System.out.println(ans.toString());
    }
}
