import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();

        int row = 1;
        while(row<=n){

            int space = 1;
            while(space<row){
                System.out.print(" ");
                space++;
            }

            int star = 1;
            while(star<=n-row+1){
                System.out.print("*");
                star++;
            }
            row++;
            System.out.println();
        }
    }
}
