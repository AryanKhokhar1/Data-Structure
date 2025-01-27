package Permutation;
// package Permutation;

public class PermutationbyRec {
    static void permuation(String pstr, String unstr){
        if(unstr.isEmpty()){
            System.out.println(pstr);
            return;
        }
        char ch = unstr.charAt(0);
        permuation(pstr+ch, unstr);
        permuation(ch+pstr, unstr);
    }
    public static void main(String[] args) {
        permuation("", "ab");
    }
}
