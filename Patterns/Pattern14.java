import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();

        int row = 1;
        while(row<=n){

            int column = 1;
            int value = 'A'+row -1;
            while(column <= row){
                System.out.print((char)value+" ");
                column++;
            }
            value++;
            row++;
            System.out.println();
        }
    }
}
