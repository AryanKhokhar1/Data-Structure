import java.sql.SQLOutput;

public class SubSequence {
    public static void main(String[] args) {
        int[] arr = {5,3,7};
        int ans = 0;
        for(int i = 1; i<(int) Math.pow(2,arr.length); i++){
            int index = 0;
            int sum =0;
            while(i != 0){
                if((i&1) == 1){
                    sum += arr[arr.length-index-1];
                    i = i>>1;
                }
                index++;
            }
            ans = Math.max(sum,ans);
            System.out.println(ans);
        }
        System.out.println("Sum of the Longest SubSequence: "+ans);
    }
}
