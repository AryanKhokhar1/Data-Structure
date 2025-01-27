public class Fibonacci {

    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }// Time Complexity of this code is O(2^n)
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
}
