
import java.util.ArrayList;

class DiceFormation{
    static ArrayList<String> dicefor(String formation, int total, int val){
        if(total  == val){
            ArrayList<String> list = new ArrayList<>();
            list.add(formation);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i<7; i++){
            if((total+i) <= val){
                list.addAll(dicefor(formation+String.valueOf(i), total+i, val));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<String> answer = dicefor("", 0, 4);
        System.out.println(answer);
    }
}