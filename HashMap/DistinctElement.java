import java.util.HashMap;
import java.util.Scanner;

class DistinctElement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();
        HashMap<Integer,Boolean> map = new HashMap<>();
        int val;
        int ans = 0;
        for(int i = 0; i<times; i++){
            val = scan.nextInt();
            if(map.get(val) == null){
                ans++;
                map.put(val,true);
            }
        }
        System.out.println(ans);
    }
}
