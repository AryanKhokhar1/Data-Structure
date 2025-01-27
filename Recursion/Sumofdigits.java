public class Sumofdigits {

    static int additon(int number){
        if(number == 0){
            return 1;
        }

        return number%10 * additon(number/10);
    }
    public static void main(String[] args) {
        int answer = additon(5512);
        System.out.println(answer);
    }
}
