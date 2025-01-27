import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();

        int row = 1;
        while(row<=n){

            int column = 1;
            while(column <= n){
                int val = 'A'+column-1;
                char value = (char)val;
                System.out.print(value+" ");
                column++;
            }
            System.out.println();
            row++;
        }
    }
}
