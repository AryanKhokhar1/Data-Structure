import java.util.Scanner;

class Pattern3{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("There is a matrix of NxN\nValue of N: ");
        int n = scan.nextInt();
        // Number of rows and column are same
        int i = 1;
        while (i <= n) {
            int c = 1;
            while (c<=n) {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
            i++;
        }
    }
}