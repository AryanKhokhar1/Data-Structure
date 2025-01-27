import java.util.Scanner;

public class Conditional_problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Character: ");
        int num = scan.next().charAt(0);
        if(num>= 48 && num<= 57){
            System.out.println("This is a Number");
        }else if(num>= 65 && num<= 90){
            System.out.println("This is Capital Alphabet");
        }else if(num>=97 && num<=122){
            System.out.println("This is a small letter");
        }
    }
}
