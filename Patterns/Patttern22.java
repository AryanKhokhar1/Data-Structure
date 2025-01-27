import java.util.Scanner;

public class Patttern22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();

        int row = 1;
        while(row<=n){

            int space = 1;
            while(space<= n-row){
                System.out.print(" ");
                space++;
            }

            int number = 1;
            while(number<= row){
                System.out.print(row);
                number++;
            }
            row++;
            System.out.println();
        }
    }
}
