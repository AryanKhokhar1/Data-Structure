import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();

        int row = 1;
        while(row<=n){
            int column = 1;
            while(column<=n){
                int value = 'A' + column + row - 2;
                System.out.print((char)value+" ");
                column++;
                value++;
            }
            row++;
            System.out.println();
        }
    }
}
