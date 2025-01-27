public class CheckPalindrome {

    static boolean check(String num, int s, int e){
        if(s >= e){
            return true;
        }
        if(num.charAt(s) != (num.charAt(e))){
            return false;
        }else{
            return check(num, s+1, e-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(check("1234321",0,"1234321".length()-1));
    }
}
