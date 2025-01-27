import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 1;
        Scanner scan  = new Scanner(System.in);
        System.out.print("nth term: ");
        int num = scan.nextInt();
        while(n<=num){

            int j = 0;
            while(j < num){
                System.out.print(n+" ");
                j++;
            }
            n++;
            System.out.println();
        }
    }
}
