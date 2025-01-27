import java.util.Scanner;

public class while_looping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scan.nextInt();
        int i = 1;
        while(i<=num){
            System.out.println("Number: "+i);
            i++;
        }
    }
}
