import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        int n = 2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scan.nextInt();
        while(n<num){
            if(num%n == 0){
                System.out.println(num+ " is not a Prime Number");
                break;
            }else{
                n++;
                if(n >= num){
                    System.out.println(num+" is a Prime Number");
                    break;
                }
            }
        }
    }
}
