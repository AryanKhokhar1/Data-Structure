import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();

        int row = 1;
        // while(row<=n){

        //     int column =1;
        //     int value = 'A' + n-row;
        //     while(column<=row){
        //         System.out.print((char)value + " ");
        //         value++;
        //         column++;
        //     }
        //     row++;
        //     System.out.println();
        // }

        while(row <= n){

            int column = 1;
            while(column<= row){
                int value = 'A' + n + column - row -1;
                System.out.print((char)value+" ");
                value++;
                column++;
            }
            row++;
            System.out.println();
        }
    }
}
