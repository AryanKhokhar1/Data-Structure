import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();

        int row = 1;
        char value =  'A';
        while(row<=n){

            int column = 1;
            while(column<=n){
                System.out.print(value+" ");
                column++;
            }
            System.out.println();
            row++;
            value++;
        }
    }
}
