import java.util.Scanner;

class Pattern15{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();

        int row = 1;
        int value = 'A';
        while(row <=n){

            int column = 1;
            while(column <= row){
                System.out.print((char)value+++" ");
                column++;
            }
            row++;
            System.out.println();
        }
    }
}