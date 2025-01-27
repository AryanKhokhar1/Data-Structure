import java.util.*;

public class countDistinct {

    static int distinctElement(Integer[] arr, int k){
        HashMap<Integer,Integer> nums = new HashMap<>();
        int ans = 0;
        int a = 0;
        for(int i = k; (a+k) <= arr.length && k<= arr.length; i++){
            HashSet<Integer> set = new HashSet<>(List.of(Arrays.copyOfRange(arr, a, (a + k))));
            a++;
            if(set.size() == k){
                return k;
            }
            ans = Math.max(ans, set.size());
        }
        return ans;
    }
    public static void main(String[] args) {
        Integer[] arr = {1,2,2,3,3,4,5,6,};
        System.out.println("Count of Distinct Element in Array: "+distinctElement(arr,3));
    }
}
