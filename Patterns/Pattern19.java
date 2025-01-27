import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();

        int row = 1;
        while(row<=n){
            int column = 1;
            while(column<=(n-row+1)){
                System.out.print("* ");
                column++;
            }
            row++;
            System.out.println();
        }
    }
}
