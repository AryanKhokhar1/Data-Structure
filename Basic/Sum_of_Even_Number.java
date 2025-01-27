import java.util.Scanner;

public class Sum_of_Even_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scan.nextInt();
        int sum =0;
        int i = 2;
        while(i<=num){
            sum += i;
            i += 2;
        }
        System.out.println("Total sum of Number: "+sum);
    }
}
