
import java.util.ArrayList;

class Phone_Letter_Combination_ArrList {
    static ArrayList<String> pad(String pstr, String unpstr){
        if(unpstr.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(pstr);
            return list;
        }
        int digit = unpstr.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for(int i = (digit-1)*3; i<digit*3; i++){
            
            list.addAll(pad(pstr+(char)('a' + i), unpstr.substring(1)));
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(pad("", "12"));
    }
}
