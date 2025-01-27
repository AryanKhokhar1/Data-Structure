import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();

        // int row = 1;
        // while(row<=n){

        //     int colmn = 1;
        //     int np = row;
        //     while(colmn<=row){
        //         System.out.print(np+" ");
        //         np++;
        //         colmn++;
        //     }
        //     System.out.println();
        //     row++;
        // }







        int row = 1;
        while(row<=n){

            int colmn = row;
            int p = colmn;
            while(p>0){
                System.out.print(colmn+" ");
                colmn++;
                p--;
            }
            System.out.println();
            row++;
        }
    }
}
