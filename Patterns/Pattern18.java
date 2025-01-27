import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();

        int row = 1;
        while(row<=n){

            int column = 1;
            while(column<=n){
                int value = n - row - column;
                if(value>= 0){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
                column++;
            }
            row++;
            System.out.println();
        }


        // while(row<=n){
        //     int space = n-row;
        //     while(space>0){
        //         System.out.print(" ");
        //         space--;
        //     }
        //     int star = row;
        //     while(star>0){
        //         System.out.print("*");
        //         star--;
        //     }
        //     row++;
        //     System.out.println();
        // }
    }
}
