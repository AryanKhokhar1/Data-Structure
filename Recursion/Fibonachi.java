public class Fibonachi {

    int FibonacchiNumber(int num){
        if(num == 0){
            return 0;
        }else if(num == 1 || num == 2){
            return 1;
        }
        return FibonacchiNumber(num-1) + FibonacchiNumber(num-2);
    }
    public static void main(String[] args) {
        Fibonachi obj = new Fibonachi();
        System.out.println(obj.FibonacchiNumber(10));
    }
}
