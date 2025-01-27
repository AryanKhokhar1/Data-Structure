import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();

        int row = 1;
        while(row<=n){

            int space = 1;
            while(space <= row-1){
                System.out.print(" ");
                space++;
            }

            int decimal = 1;
            while(decimal <= n-row+1){
                System.out.print(row);
                decimal++;
            }
            row++;
            System.out.println();
        }
    }
}
