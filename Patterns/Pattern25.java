import java.util.Scanner;

public class Pattern25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();

        int row = 1;
        while(row<=n){

            int space = 1;
            while(space<=n-row){
                System.out.print(" ");
                space++;
            }

            int lnum = 1;
            while(lnum <= row){
                System.out.print(lnum);
                lnum++;
            }

            int rnum = 1;
            while(rnum<=row-1){
                System.out.print(row-rnum);
                rnum++;
            }
            row++;
            System.out.println();
        }
    }
}
