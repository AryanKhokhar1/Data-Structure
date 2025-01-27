public class BubbleSort {

    static void byIteration(int[] arr){
        int len = arr.length;
        int c;
        for(int i = 0; i<arr.length; i++){
            for(int j = 1; j<len; j++){
                System.out.println(arr[j-1]+">"+arr[j]+" = "+(arr[j-1]>arr[j]));
                if(arr[j-1]>arr[j]){
                    c = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = c;
                }
            }
            len--;
        }

    }
    static void byRecursion(int[] arr, int len, int currindex){

        if(len == 1){
            return;
        }

        if(currindex<len){
            System.out.println(arr[currindex-1]+">"+arr[currindex]+" = "+(arr[currindex-1]>arr[currindex]));
            if(arr[currindex-1]>arr[currindex]){
                int c = arr[currindex];
                arr[currindex] = arr[currindex-1];
                arr[currindex-1] = c;
            }
            byRecursion(arr, len, currindex+1);
        }else{
            byRecursion(arr, len-1,1);
        }


    }
    public static void main(String[] args) {
        int[] arr = {5,1, 4,2,8,9};
        // byIteration(arr);
        byRecursion(arr,arr.length,1);
        for(int element: arr){
            System.out.print(element+", ");
        }
        System.out.println();
    }
}
