import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();

        int row = 1;
        int counting = 1;
        while(row <= n){

            int colmn = 1;
            while (colmn <= row) {
                System.out.print(counting+" ");
                counting++;
                colmn++;
            }
            System.out.println();
            row++;
        }
    }
}
