import java.util.Scanner;

public class Pattern5 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();

        int i = 1;
        while(i<=n){

            int j = 1;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
