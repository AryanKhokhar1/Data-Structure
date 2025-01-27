import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();
        int row = 1;
        int value = 1;
        while(row<=n){

            int space = 1;
            while(space<=n-row){
                System.out.print(" ");
                space++;
            }

            int number = 1;
            while(number<= row){
                System.out.print(value);
                number++;
                value++;
            }
            row++;
            System.out.println();
        }
    }
}
