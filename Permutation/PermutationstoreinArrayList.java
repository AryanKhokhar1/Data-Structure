package Permutation;

import java.util.ArrayList;

public class PermutationstoreinArrayList {
    static ArrayList<String> permuation(String pstr, String unstr){
        if(unstr.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(pstr);
            return ans;
        }
        char ch = unstr.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i<pstr.length()+1; i++){
            ans.addAll(permuation(pstr.substring(0,i)+ch+pstr.substring(i,pstr.length()),unstr.substring(1)));
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> answer = permuation("", "abc");
        System.out.println(answer.toString());
    }
}
