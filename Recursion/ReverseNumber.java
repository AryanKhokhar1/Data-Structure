import java.sql.SQLOutput;

public class ReverseNumber {

    static int rev(int num){
        int a = num%10;
        num = num/10;
        if(num == 0){
            return a;
        }else{
            return a* (int)Math.pow(10,String.valueOf(num).length()) + rev(num);
        }
    }

    public static void main(String[] args) {

        System.out.println(rev(1234));
    }
}
