import java.util.Scanner;

public class Pattern26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();
        int row = 1;
        while(row<=n){

            int lnum = 1;
            while(lnum<=n-row+1){
                System.out.print(lnum++);
            }
            
            int star = 1;
            while(star<=2*(row-1)){
                System.out.print("*");
                star++;
            }
            
            int rnum = 1;
            while(rnum<=n-row+1){
                System.out.print(n-row-rnum+2);
                rnum++;
            }
            row++;
            System.out.println();
        }
    }
}
