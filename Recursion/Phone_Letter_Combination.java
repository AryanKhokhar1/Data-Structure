import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Phone_Letter_Combination {
    static ArrayList<String> phoneNumber(String unpstr,ArrayList<String> pstr, HashMap<Character,String> map ){

        if(unpstr.isEmpty()){
            return pstr;
        }
        ArrayList<String> arr = new ArrayList<>();
        String val = map.get(unpstr.charAt(0));
        for(int i = 0; i<val.length(); i++){
            for(String ele: pstr){
                arr.add(ele+String.valueOf(val.charAt(i)));
            }
        }
        return phoneNumber(unpstr.substring(1), arr, map);
    }
    public static void main(String[] args) {
        HashMap<Character, String> NumtoStr = new HashMap<>();
        NumtoStr.put('2', "abc");
        NumtoStr.put('3', "def");
        NumtoStr.put('4', "ghi");
        NumtoStr.put('5', "jkl");
        NumtoStr.put('6', "mno");
        NumtoStr.put('7', "pqrs");
        NumtoStr.put('8', "tuv");
        NumtoStr.put('9', "wxyz");

        Scanner scan = new Scanner(System.in);
        System.out.print("Digits: ");
        String unpstr = scan.nextLine();
        ArrayList<String> pstr = new ArrayList<>();
        pstr.add("");
        System.out.println(phoneNumber(unpstr,pstr,NumtoStr));
    }
}