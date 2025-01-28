package Permutation;
// package Permutation;

public class PermutationbyRec {
    static void permuation(String pstr, String unstr){
        if(unstr.isEmpty()){
            System.out.println(pstr);
            return;
        }
        char ch = unstr.charAt(0);
        for(int i = 0; i<pstr.length()+1; i++){
            permuation(pstr.substring(0,i) + ch + pstr.substring(i,pstr.length()),unstr.substring(1));
        }
    }
    public static void main(String[] args) {
        permuation("", "abc");
    }
}
