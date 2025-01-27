import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of rows: ");
        int num = scan.nextInt();
        int i = 0;
        while(i<num){
            int j = 0;
            while(j<num){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
