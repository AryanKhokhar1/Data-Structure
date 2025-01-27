public class NaturalNumber {

    static void Natural(int num){
        if(num == 0){
            return;
        }
        Natural(num-1);
        System.out.println(num);
    }

    public static void main(String[] args) {
        Natural(5);
    }
}
//1
//2