
import java.util.Arrays;

public class InsertionSort {
    static void byIteration(int[] arr){
        int val;
        for(int i = 0; i<arr.length; i++){
            int setIndex = i;
            val = arr[i];
            for(int j = 0; j<=i; j++){
                if(arr[i] < arr[j]){
                    setIndex = j;
                    break;
                }
            }
            for(int p = i; p> setIndex; p--){
                arr[p] = arr[p-1];
            }
            arr[setIndex] = val;
            System.out.println(Arrays.toString(arr));
        }
    }
    static void byRecursion(int[] arr,int n){
        if(n <= 1){
            return;
        }
        byRecursion(arr, n-1);
        
        int last = arr[n-1];
        int j = n-2;

        while(j >= 0 && arr[j] > last){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;

    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 7, 2};
        // byIteration(arr);
        byRecursion(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
