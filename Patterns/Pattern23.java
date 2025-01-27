import java.util.Scanner;

public class Pattern23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();
        int row = 1;
        while(row<=n){

            int space = 1;
            while(space<=row-1){
                System.out.print(" ");
                space++;
            }

            int number = 1;
            while(number<= n-row+1){
                System.out.print(number+row-1);
                number++;
            }
            row++;
            System.out.println();
        }
    }
}
