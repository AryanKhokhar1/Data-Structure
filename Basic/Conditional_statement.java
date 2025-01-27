import java.util.Scanner;
class Conditional_statement {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Value of 'A':");
        int a = scan.nextInt();
        System.out.print("Value of 'B':");
        int b = scan.nextInt();
        if(a>b){
            System.out.println(a+" is bigger");
        }else if(a == b){
            System.out.println(a+" is equals to b");
        }else{
            System.out.println(b+" is bigger");
        }
    }
}
