import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N:");
        int n = scan.nextInt();

        // int row =1;
        // while(row<=n){

        //     int column = 1;
        //     int value = row;
        //     while(column <= row){
        //         System.out.print(value+" ");
        //         value--;
        //         column++;
        //     }
        //     System.out.println();
        //     row++;
        // }






        int row = 1;
        while(row<=n){
            
            int column = 1;
            while(column<=row){
                System.out.print(row-column+1+" ");
                column++;
            }
            System.out.println();
            row++;
        }
    }
}
