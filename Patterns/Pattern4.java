import java.util.Scanner;

class Pattern4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Value of N:");
        int n = scan.nextInt();

        // n denote number of rows and columns
        
        int i = 1;
        int num = 1;
        while(i<=n){
            
            int j = 1;
            while(j<=n){
                System.out.print(num+" ");
                j++;
                num++;
            }
            System.out.println();
            i++;
        }
    }
}
