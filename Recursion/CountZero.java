public class CountZero {

    static int count(int number, int zero ){
        if(number == 0){
            return zero;
        }
        if(number%10 == 0){
            return count(number/10, ++zero);
        }else{
            return count(number/10,zero);
        }
    }
    public static void main(String[] args) {
        int ans = count(10203030,0);
        System.out.println("The Number of Zeroes in the Number: "+ans);
    }
}
